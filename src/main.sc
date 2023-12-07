require: requirements.sc

theme: /

    state: Start
        q!: $regex</start>
        script:
            $session.checkFunction = CheckBase()
            log("CHECK BASE: " + $session.checkFunction)
            $session.managerPhone = ''

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}
    
    state: CheckBot
        q!: $regex</checkbot>
        a: Бот успешно работает