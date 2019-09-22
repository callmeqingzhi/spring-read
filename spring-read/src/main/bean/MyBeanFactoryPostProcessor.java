package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 对bean做处理
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		GenericBeanDefinition u = (GenericBeanDefinition)beanFactory.getBeanDefinition("u");
//		System.out.println(u.getBeanClassName());
//		u.setBeanClass(Student.class);
	}
}
