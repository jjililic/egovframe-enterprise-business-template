

-- ���̺� �����̽� ��ȸ
select * from dba_tablespaces;

select * FROM DBA_DATA_FILES;

-- ���̺� �����̽� ����
create tablespace EGOVFRAME_EBT
    datafile '/u01/app/oracle/oradata/XE/egovframe_ebt.dbf'
    size 256M reuse
    autoextend on next 10M
    maxsize 512M;