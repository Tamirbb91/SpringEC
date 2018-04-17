insert into cs544.tv_show values(1, "The world of the Vikings is brought to life through the journey of Ragnar Lothbrok", "Michael Hirst", "DRAMA", "Vikings", 8.6, "History Channel");

insert into cs544.tv_show values(2, "Nine noble families fight for control over the mythical lands of Westeros", "David Benioff", "DRAMA", "Game of Thrones", 9.5, "Home Box Office");

insert into cs544.tv_show values(3, "A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family's future.", "Vince Gilligan", "DRAMA", "Breaking Bad", 9.5, "High Bridge Productions");

insert into cs544.season values(1, now(), '123232323', 1, "Rollo battles Ragnar when Jarl Borg and King Horik's men clash.", 1);

insert into cs544.season values(2, now(), '123232323', 2, "Four years later, Ragnar finally announces plans to raid England. Horik and Borg arrive", 1);

insert into cs544.season values(3, now(), '123232323', 3, "Ragnar and his men move deeper into Wessex. He believes the land's greatest wealth is its rich soil, which could support a Viking colony.", 1);


insert into cs544.tv_show_seasons values (1, 1);

insert into cs544.tv_show_seasons values (1, 2);

insert into cs544.tv_show_seasons values (1, 3);

insert into cs544.episode values (1, now(), "Rites of Passage", 1, 1);

insert into cs544.episode values (2, now(), "Wrath of the Northmen", 2, 1);

insert into cs544.episode values (3, now(), "Dispossessed", 3, 1);

insert into cs544.episode values (4, now(), "Brother's War", 1, 2);

insert into cs544.episode values (5, now(), "Invasion", 2, 2);

insert into cs544.episode values (6, now(), "The Outsider (Recap)", 3, 2);

insert into cs544.episode values (7, now(), "Eye For an Eye", 4, 2);

insert into cs544.episode values (8, now(), "Answers in Blood", 5, 2);

insert into cs544.episode values (9, now(), "Mercenary", 1, 3);

insert into cs544.episode values (10, now(), "The Wanderer", 2, 3);

insert into cs544.artist values (1, "Travis Fimmel is an Australian actor and former model. He is known for his role as Ragnar Lothbrok", "123123", "Travis Fimmel", "Australia");

insert into cs544.artist values (2, "Katheryn Winnick is a Canadian actress. She is known for her roles in Amusement, Bones and Vikings", "123123", "Katheryn Winnick", "Canada");

insert into cs544.artist values (3, "Gustaf Caspar Orm Skarsgård is a Swedish actor. He is best known outside Scandinavia for his role as Floki.", "123123", "Gustaf Skarsgård", "Sweden");

insert into cs544.artist values (4, "Alexander Ludwig is a Canadian actor, singer and model. His notable film credits include The Seeker: The Dark Is Rising and The Hunger Games. ", "123123", "Alexander Ludwig", "Canada");

insert into cs544.artist_episodes values(1, 1);

insert into cs544.artist_episodes values(1, 2);

insert into cs544.artist_episodes values(1, 3);

insert into cs544.artist_episodes values(1, 4);

insert into cs544.artist_episodes values(1, 5);

insert into cs544.artist_episodes values(1, 6);

insert into cs544.artist_episodes values(1, 7);

insert into cs544.artist_episodes values(1, 8);

insert into cs544.artist_episodes values(1, 9);

insert into cs544.artist_episodes values(1, 10);


insert into cs544.artist_episodes values(2, 1);

insert into cs544.artist_episodes values(2, 2);

insert into cs544.artist_episodes values(2, 3);

insert into cs544.artist_episodes values(2, 4);

insert into cs544.artist_episodes values(2, 5);

insert into cs544.artist_episodes values(2, 6);

insert into cs544.artist_episodes values(2, 7);

insert into cs544.artist_episodes values(2, 8);

insert into cs544.artist_episodes values(2, 9);

insert into cs544.artist_episodes values(2, 10);




insert into cs544.artist_episodes values(3, 1);

insert into cs544.artist_episodes values(3, 2);

insert into cs544.artist_episodes values(3, 3);

insert into cs544.artist_episodes values(3, 4);

insert into cs544.artist_episodes values(3, 5);

insert into cs544.artist_episodes values(3, 6);

insert into cs544.artist_episodes values(3, 7);

insert into cs544.artist_episodes values(3, 8);

insert into cs544.artist_episodes values(3, 9);

insert into cs544.artist_episodes values(3, 10);

insert into cs544.episode_cast values (1, 1, "Ragnar Lothbrok");

insert into cs544.episode_cast values (2, 1, "Ragnar Lothbrok");

insert into cs544.episode_cast values (3, 1, "Ragnar Lothbrok");

insert into cs544.episode_cast values (4, 1, "Ragnar Lothbrok");

insert into cs544.episode_cast values (5, 1, "Ragnar Lothbrok");

insert into cs544.episode_cast values (6, 1, "Ragnar Lothbrok");

insert into cs544.episode_cast values (7, 1, "Ragnar Lothbrok");

insert into cs544.episode_cast values (8, 1, "Ragnar Lothbrok");

insert into cs544.episode_cast values (9, 1, "Ragnar Lothbrok");

insert into cs544.episode_cast values (10, 1, "Ragnar Lothbrok");

insert into cs544.episode_cast values (1, 2, "Lagertha Lothbrok");

insert into cs544.episode_cast values (2, 2, "Lagertha Lothbrok");

insert into cs544.episode_cast values (3, 2, "Lagertha Lothbrok");

insert into cs544.episode_cast values (4, 2, "Lagertha Lothbrok");

insert into cs544.episode_cast values (5, 2, "Lagertha Lothbrok");

insert into cs544.episode_cast values (6, 2, "Lagertha Lothbrok");

insert into cs544.episode_cast values (7, 2, "Lagertha Lothbrok");

insert into cs544.episode_cast values (8, 2, "Lagertha Lothbrok");

insert into cs544.episode_cast values (9, 2, "Lagertha Lothbrok");

insert into cs544.episode_cast values (10, 2, "Lagertha Lothbrok");

insert into cs544.episode_cast values (1, 3, "Bjorn Lothbrok");

insert into cs544.episode_cast values (2, 3, "Bjorn Lothbrok");

insert into cs544.episode_cast values (3, 3, "Bjorn Lothbrok");

insert into cs544.episode_cast values (4, 3, "Bjorn Lothbrok");

insert into cs544.episode_cast values (1, 4, "Floki Vilger");

insert into cs544.episode_cast values (2, 4, "Floki Vilger");

insert into cs544.episode_cast values (3, 4, "Floki Vilger");

insert into cs544.comment values(1, "Hard to get in to it", now(), "Felix Bergman", 1);

insert into cs544.comment values(2, "Lots of penitential", now(), "Jack Caulfield", 1);

insert into cs544.comment values(3, "Breaking the Laws", now(), "Claudio Carvalho", 1);

insert into cs544.comment values(4, "A great start for voyage and pillage", now(), "Quincy the odore", 3);

insert into cs544.comment values(5, "Choices", now(), "Claudio Carvalho", 2);

insert into cs544.comment values(6, "Ok; They Are Not Losing Any Time. Are They?", now(), "David del Real", 2);

insert into cs544.comment values(7, "Promising Beginning of the Third Season", now(), "Claudio Carvalho", 3);

insert into cs544.comment values(8, "Bugger me i love his show", now(), "Philverhey", 3);

insert into cs544.comment values(9, "The Price for Infidelity", now(), "Claudio Carvalho", 3);

commit;




