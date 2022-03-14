# daily-challenge

# consultas

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




