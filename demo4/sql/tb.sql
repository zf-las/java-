create table `user`(
  `userId` int(10) not null ,
  `username` varchar(48) not null,
  `password` varchar(48) not null,
  primary key (`userId`)
);
insert into `user` values(1,'zs','1234');
create table `Wallet`(
  `walletId` int(10) not null,
  `userId` int(10) not null,
  `balance` int(24),
  primary key (`walletId`)
);
insert into `Wallet` value (1,1,5000);
create table `Trade`(
  `tradeId` int(10) not null ,
  `walletId` int(10) not null,
  `userId` int(10) not null,
  `tradetype` varchar(12),
  `tMoney` int(24),
  primary key (`tradeId`)
);
insert into `Trade` value (1,1,1,1,100);
