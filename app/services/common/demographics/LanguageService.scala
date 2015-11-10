package services.common.demographics

import com.datastax.driver.core.ResultSet
import domain.common.demographics.Language
import repository.common.demographics.LanguageRepository
import services.Service

import scala.concurrent.Future

/**
 * Created by hashcode on 2015/11/08.
 */
object LanguageService extends Service{
  def saveOrUpdate(entity: Language): Future[ResultSet] = {
    LanguageRepository.save(entity)
  }

}