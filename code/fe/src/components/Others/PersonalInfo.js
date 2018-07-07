import React from 'react';
import { Divider } from 'antd';
import EmailPopUp from './EmailPopUp';
import PhonePopUp from './PhonePopUp';
import ModifyForm from './ModifyForm';
import DeleteAccountPopUp from './DeleteAccountPopUp';

class PersonalInfo extends React.Component{
    render(){
        return(
            <div>
                <Divider orientation="left">更改密码</Divider>
                <ModifyForm /> 
                <Divider orientation="left">更改邮箱</Divider>
                <EmailPopUp />
                <Divider orientation="left">更改号码</Divider>
                <PhonePopUp />
                <Divider orientation="left">删除账号</Divider>
                <DeleteAccountPopUp />
                <div className="fill" />
            </div>
        );
    }
}

export default PersonalInfo;