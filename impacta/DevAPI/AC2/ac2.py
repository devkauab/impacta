from flask import Flask, jsonify, make_response

produtos = [
    {
        'desenvolvedora':'ea',
        'jogo':'Fifa',
        'Valor':'R$250,00'
    },
    {
        'desenvolvedora':'ea',
        'jogo':'It Takes Two',
        'Valor':'R$200,00'

    },
    {
        'desenvolvedora':'ea',
        'jogo':'Battlefield 2042',
        'Valor':'R$300,00'

    },
    {
        'desenvolvedora':'rockstar',
        'jogo':'Grand Theft Auto V',
        'Valor':'R$150,00'
    },
    {
        'desenvolvedora':'rockstar',
        'jogo':'Red Dead Redemption',
        'Valor':'R$250,00'
    },
    {
        'desenvolvedora':'concernedape',
        'jogo':'Stardew valley',
        'Valor':'R$30,00'
    },
    {
        'desenvolvedora':'concernedape',
        'jogo':'Starbound',
        'Valor':'R$35,00'
    },
    {
        'desenvolvedora':'mojang',
        'jogo':'Minecraft',
        'Valor':'R$100,00'
    },
    {
        'desenvolvedora':'mojang',
        'jogo':'Minecraft Dugeons',
        'Valor':'R$150,00'
    }
]

app = Flask(__name__)

@app.route("/", methods=['GET'])
def index():
    return "Acesse /jogos para visualizar todos os produtos e use /jogos/*nome da desenvolvedora* para filtrar por desenvolvedora", 200

@app.route("/jogos", methods=['GET'])
def prods():
    return jsonify(produtos), 200

@app.route('/jogos/<string:desenvolvedora>', methods=['GET'])
def search(desenvolvedora):
    list = []

    for prod in produtos:
        if prod.get('desenvolvedora') == desenvolvedora:
            list.append(prod)
    if len(list) == 0:
        return "Desenvolvedora não encontrada", 404    
    return jsonify(list), 200

if __name__=="__main__":
    app.run()