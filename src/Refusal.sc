theme: /Refusal
    state: Refusal
        intent!: /dontWant
        intent!: /dontNeed
        a: А можно уточнить, почему отказываетесь, вы уже оформили полис ОСАГО где-то еще?
        
        state: SoldCar
            intent: /carSold
            a: Поняла Вас, тогда прошу прощения за беспокойство, хорошего дня Вам!
            
        state: RefusalAttempt1
            intent: /dontWant
            intent: /dontNeed
            a: Вам ведь важно чувствовать себя безопасно за рулем автомобиля, правда? С полисом ОСАГО от АльфаСтрахования это чувство безопасности и комфорта за рулем будет с вами в каждой поездке. Готовы продлить ваш полис ОСАГО? 
            
            state: RefusalAttempt2
                intent: /dontWant
                intent: /dontNeed
                intent: /confirmation/False
                a: Вы же слышали, что штраф за отсуствие полиса ОСАГО составляет 800 рублей?
                
                state: Yes
                    intent: /confirmation/True
                    go!: /Refusal/Refusal/RefusalAttempt1/RefusalAttempt3
                
                state: No
                    intent: /confirmation/False
                    a: На данный момент штраф за отсутствие полиса ОСАГО и за езду с просроченным полисом ОСАГО составляет 800 рублей. Согласитесь, что штрафы это всегда неприятно.
                    go!: /Refusal/Refusal/RefusalAttempt1/RefusalAttempt3
            
            state: RefusalAttempt3
                a: Если продлите полис ОСАГО от АльфаСтрахования вы не только выполните требования государства, но и будете спокойны каждый раз, когда куда-то едете за рулем. Вы хотите продлить полись ОСАГО?
                
                state: Yes
                    intent: /confirmation/True
                    # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ ОТКАЗЕ
                    
                state: No
                    intent: /confirmation/False
                    # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ СОГЛАСИИ
            
            state: RefusalAttempt1No
                intent: /confirmation/False
                # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ ОТКАЗЕ
    
        state: NotOurClient
            intent: /wrongPerson
            # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ ОТКАЗЕ
            
        state: Expensive
            intent: /expensive
            a: Вы считаете, что наш полис ОСАГО дорогой?
            
            state: Yes
                intent: /confirmation/True
                a: Понимаю, но могу Вас заверить, что АльфаСтрахование предоставляет одни из самых лучших условий на рынке. Плюс полис можно оформить дистанционно, что поможет не только сохранить Ваше время, но и позволит вам всегда иметь его под рукой.  Может быть мы сделаем для вас уникальное предложение?
                
                state: Yes
                    intent: /confirmation/True
                    # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ СОГЛАСИИ
                
                state: No
                    intent: /confirmation/False
                    # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ ОТКАЗЕ
                
            state: No
                intent: /confirmation/False
                
        state: WillThink
            intent: /toThink
            a: Понимаю, что такие решения сложно принять на лету. Но было бы здорово получить выгодное предложение для пролонгации вашего полиса, я права? 
            
            state: Yes
                intent: /confirmation/True
                # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ СОГЛАСИИ (УТОЧНИТЬ ИМЕННО ПРО ЭТОТ СТЕЙТ)
                
            state: No
                intent: /confirmation/False
                a: Советуем не затягивать с решением по пролонгации договора ОСАГО. Вы же знаете, что штраф при езде без полиса ОСАГО или с просроченным полисом ОСАГО сейчас составляет 800 рублей? Согласитесь, что терять деньги из-за такой мелочи не хотелось бы. Может быть, наш специалист все-таки свяжется с вами и просто расскажет про условия, которые Альфострахование сейчас готово предоставить для вас?
                
                state: Yes
                    intent: /confirmation/True
                    # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ СОГЛАСИИ
                    
                state: No
                    intent: /confirmation/False
                    # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ ОТКАЗЕ
        
        state: HowFound
            intent: /howFound
            a: Вы являетесь клиентом АльфаСтрахования. При оформлении договора Вы оставляли свой номер телефона для связи. Пролонгация договора ОСАГО для Вас актуальна?
            
            state: Yes
                intent: /confirmation/True
                # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ СОГЛАСИИ
                
            state: No
                intent: /confirmation/False
                go!: /Refusal/Refusal
        
        state: Fraud
            intent: /fraud
            a: Компания АльфаСтрахование на рынке уже более 30 лет. Наша компания наоборот бореться со всевозможными случаями мошенничества, в том числе связанными с полисами ОСАГО. Выбирая Альфастрахование, вы можете быть уверены в прозрачности условий оформления полиса ОСАГО. Готовы узнать про наши условия пролонгации договора ОСАГО поподробнее?
            
            state: Yes
                intent: /confirmation/True
                # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ СОГЛАСИИ
                
            state: No
                intent: /confirmation/False
                # go!: СТЕЙТ С ПРОЩАНИЕМ ПРИ ОТКАЗЕ
                
        state: WillArrangeMyself
            intent: /willarrangeMyself
            a: Мы рады такому решению.  Спасибо, что остаетесь с нами!
            # Прописать прощание
                
