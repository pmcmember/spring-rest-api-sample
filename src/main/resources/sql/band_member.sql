drop table if exists band_member;
create table band_member
(
    member_id   integer generated always as identity primary key,
    last_name   varchar(20)                            not null,
    first_name  varchar(20)                            not null,
    age         integer,
    part        varchar(20),
    created_at  timestamp(0) default current_timestamp not null,
    create_user varchar(50),
    update_at   timestamp(0) default current_timestamp not null,
    update_user varchar(50)                            not null,
    delete_flg  char(1)      default '0'               not null
);

comment on column band_member.member_id IS 'メンバーID';
comment on column band_member.last_name IS '苗字';
comment on column band_member.first_name IS '名前';
comment on column band_member.age IS '年齢';
comment on column band_member.part IS '担当楽器';
comment on column band_member.created_at IS 'レコード作成日';
comment on column band_member.create_user IS 'レコード作成者';
comment on column band_member.update_at IS 'レコード更新日';
comment on column band_member.update_user IS '最終更新者';
comment on column band_member.delete_flg IS '論理削除';