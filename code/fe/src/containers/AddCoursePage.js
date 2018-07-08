import React from 'react';
import {Layout, Icon} from 'antd';
import Sidebar from '../components/Parts/Sidebar';
import Dropdown from '../components/Parts/Dropdown';
import WrappedAddCourse from "../components/AddCourse/AddCourse";
const {Header, Content, Sider}=Layout;

class AddCoursePage extends React.Component {
    handleClick = (e) => {
        console.log('click ', e);
    };

    render() {
        return(
            <Layout>
                <Header className={"header"} style={{background:'#aaa'}}>
                    <div align = "right">
                        <span className='user'> <Icon type="user"/></span>
                        <Dropdown />
                    </div>
                </Header>
                <Layout>
                    <Sider width={256} style={{background: '#fff'}}>
                        <Sidebar />
                    </Sider>
                    <Layout>
                        <Content>
                            <WrappedAddCourse />
                            <div className="fill"/>
                        </Content>
                    </Layout>
                </Layout>
            </Layout>
        )
    }
}

export default AddCoursePage;