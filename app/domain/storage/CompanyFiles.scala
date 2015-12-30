package domain.storage

import java.nio.ByteBuffer

import com.websudos.phantom.util.ByteString
import play.api.libs.json.Json

/**
 * Created by hashcode on 2015/12/29.
 */
case class CompanyFiles(company: String,
                        id: String,
                        file: ByteBuffer,
                        fileBuffer: ByteString)

