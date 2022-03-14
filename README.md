# daily-challenge

Projeto criado para utilização de exemplos nos de treinamentos ministrados no [YouTube](https://www.youtube.com/c/DanielWisky).

## Consultas

* Calcular tempo total de processamento:
```
db.messages.aggregate([{
    $group: {
	_id: null,
	maxDate: {
	    $max: "$creationDate"
	},
	minDate: {
	    $min: "$creationDate"
	}
    }
}, {
    $project: {
	_id: 0
    }
}]).forEach((group)=> { 
    var tempoProcessamento = (group.maxDate - group.minDate) / 1000
    print("tempo total: " + tempoProcessamento + " (s)");
});
```

* Consultar mensagens duplicadas:
```
db.messages.aggregate([{
        "$group": {
            _id: "$content",
            count: {
                $sum: 1
            }
        }
    },
    {
        $sort: {
            'count': -1
        }
    }
]);
```

* Remover todos os registros:
```
db.messages.deleteMany({});
```




