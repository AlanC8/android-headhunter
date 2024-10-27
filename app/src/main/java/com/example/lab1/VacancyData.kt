package com.example.lab1

fun getVacancies(): List<Vacancy> {
    return listOf(
        Vacancy("Python Developer", "Microsoft", "130,000 USD", "Seattle",
            "Microsoft Corporation is a technology company that develops, manufactures, and sells " +
                    "computer software, consumer electronics, and personal computers. It is best known " +
                    "for its software products like Microsoft Windows and Microsoft Office.",
            "Опыт разработки на Python не менее 4 лет.\n" +
                    "Знание Django или Flask framework.\n" +
                    "Опыт работы с AWS или Azure.\n" +
                    "Знание принципов CI/CD.\n" +
                    "Опыт работы с микросервисной архитектурой.",
            "Отправьте свое резюме и примеры кода на адрес recruitment@microsoft.com с " +
                    "темой \"Python Developer Position\"."),
        Vacancy("Frontend Developer", "Kaspi Bank", "55,000 USD", "Almaty",
            "Kaspi.kz - это казахстанская технологическая компания, разрабатывающая инновационные " +
                    "мобильные платежные решения, электронную коммерцию и финансовые технологии.",
            "Опыт работы с React не менее 2 лет.\n" +
                    "Знание JavaScript/TypeScript.\n" +
                    "Опыт работы с Redux и REST API.\n" +
                    "Понимание принципов адаптивной верстки.\n" +
                    "Знание HTML5 и CSS3.",
            "Отправьте ваше портфолио и резюме на jobs@kaspi.kz с пометкой " +
                    "\"Frontend Developer Application\"."),
        Vacancy("Data Scientist", "Amazon", "160,000 USD", "New York",
            "Amazon.com, Inc. is an American multinational technology company focusing on " +
                    "e-commerce, cloud computing, digital streaming, and artificial intelligence.",
            "Степень магистра или PhD в области Data Science, Computer Science или смежных областях.\n" +
                    "Опыт работы с Python и R.\n" +
                    "Знание машинного обучения и статистики.\n" +
                    "Опыт работы с большими данными (Hadoop, Spark).\n" +
                    "Навыки визуализации данных.",
            "Пожалуйста, заполните анкету на careers.amazon.com и приложите резюме с " +
                    "темой \"Data Scientist Position\"."),
        Vacancy("DevOps Engineer", "ForteBank", "70,000 USD", "Astana",
            "ForteBank - один из крупнейших банков Казахстана, предоставляющий полный спектр " +
                    "финансовых услуг как для физических, так и для юридических лиц.",
            "Опыт работы DevOps инженером от 3 лет.\n" +
                    "Знание Linux/Unix систем.\n" +
                    "Опыт работы с Docker, Kubernetes, Jenkins.\n" +
                    "Знание скриптовых языков (Python, Bash).\n" +
                    "Опыт работы с системами мониторинга.",
            "Отправьте ваше резюме на hr@fortebank.kz с указанием позиции " +
                    "\"DevOps Engineer\" в теме письма."),
        Vacancy("Data Engineer", "AirAstana", "65,000 USD", "Almaty",
            "Air Astana - крупнейшая авиакомпания Казахстана, выполняющая внутренние и международные " +
                    "рейсы. Компания известна высоким уровнем сервиса и современным флотом.",
            "Опыт работы Data Engineer от 2 лет.\n" +
                    "Знание Python и SQL.\n" +
                    "Опыт работы с Apache Spark, Hadoop.\n" +
                    "Навыки работы с ETL процессами.\n" +
                    "Опыт работы с облачными платформами (AWS/GCP).",
            "Для подачи заявки отправьте резюме на careers@airastana.com с темой " +
                    "\"Data Engineer Position\"."),

                Vacancy("Security Engineer", "Kaspi Bank", "75,000 USD", "Almaty",
        "Kaspi Bank - ведущий финтех банк в Казахстане, предоставляющий инновационные " +
                "платежные решения и банковские услуги через мобильное приложение.",
        "Опыт работы в информационной безопасности от 4 лет.\n" +
                "Знание сетевой безопасности и протоколов.\n" +
                "Опыт работы с системами обнаружения вторжений.\n" +
                "Знание современных практик безопасности.\n" +
                "Опыт проведения аудита безопасности.",
        "Отправьте ваше резюме и сертификаты на security.jobs@kaspi.kz с указанием " +
                "\"Security Engineer Application\" в теме письма."),

    Vacancy("Cloud Architect", "BCC", "80,000 USD", "Astana",
        "Банк ЦентрКредит (BCC) - один из крупнейших банков Казахстана, " +
                "предоставляющий широкий спектр финансовых услуг и активно развивающий " +
                "цифровые технологии.",
        "Опыт работы с облачными технологиями от 5 лет.\n" +
                "Глубокие знания AWS и/или Azure.\n" +
                "Опыт проектирования масштабируемых систем.\n" +
                "Знание методологий DevOps и Agile.\n" +
                "Опыт с микросервисной архитектурой.",
        "Отправьте ваше резюме и портфолио проектов на hr@bcc.kz с пометкой " +
                "\"Cloud Architect Position\"."),

    Vacancy("Infrastructure Engineer", "Beeline", "62,000 USD", "Almaty",
        "Beeline Kazakhstan - ведущий оператор связи, предоставляющий услуги " +
                "мобильной связи, интернета и цифровых сервисов по всему Казахстану.",
        "Опыт работы с сетевой инфраструктурой от 3 лет.\n" +
                "Знание сетевых технологий и протоколов.\n" +
                "Опыт работы с системами виртуализации.\n" +
                "Навыки автоматизации инфраструктуры.\n" +
                "Знание основ информационной безопасности.",
        "Для рассмотрения вашей кандидатуры отправьте резюме на jobs@beeline.kz " +
                "с темой \"Infrastructure Engineer Application\".")

    )
}
