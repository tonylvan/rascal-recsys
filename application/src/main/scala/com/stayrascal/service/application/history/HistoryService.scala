package com.stayrascal.service.application.history

import com.stayrascal.service.application.domain.{HistoryRecord, NumOfUsers, TotalFreq}
import org.apache.spark.streaming.dstream.DStream

trait HistoryService {
  def init(): Unit

  /**
    * 添加一条历史记录
    *
    * @param historyRecord 历史纪录
    */
  def addHistoryRecord(historyRecord: String)

  /**
    * 获得有多少用户在使用完构件1之后又使用其它构件
    *
    * @param compName 构件1的名字
    * @return 用户数
    */
  def getNumOfUsers(compName: String): java.util.List[NumOfUsers]

  /**
    * 获得用户使用构件1之后又使用了哪些构件
    *
    * @param userName 用户名
    * @param compName 构件1的名字
    * @return 使用历史
    */
  def getHistoryForUser(userName: String, compName: String): java.util.List[HistoryRecord]

  /**
    * 获得使用完构件1又使用其它构件的总次数
    *
    * @param compName 构件1的名字
    * @return 总次数
    */
  def getTotalFreq(compName: String): java.util.List[TotalFreq]

  /**
    * 获得受欢迎的构件对的使用人数
    *
    * @param limit 指定构件对的数量
    * @return
    */
  def getPopularUsagesPopulation(limit: Int): java.util.List[NumOfUsers]

  /**
    * 获得受欢迎的构件对的使用次数
    *
    * @param limit 指定构件对的数量
    * @return
    */
  def getPopulatedUsagesCount(limit: Int): java.util.List[TotalFreq]

  def getHistoryRecordStream: DStream[(String, String, String, Long)]

  def saveHistoryRecords(historyStream: DStream[(String, String, String, Long)])
}
