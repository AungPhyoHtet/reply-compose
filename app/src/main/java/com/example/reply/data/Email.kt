package com.example.reply.data

import androidx.annotation.StringRes

data class Email(
  val id: Long,
  val sender: Account,
  val recipients: List<Account> = emptyList(),
  @StringRes val subject: Int = -1,
  @StringRes val body: Int = -1,
  /** Which mailbox it is in **/
  var mailbox: MailboxType = MailboxType.Inbox,
  /**
   * Relative duration in which it was created. (e.g. 20 mins ago)
   * It should be calculated from relative time in the future.
   * For now it's hard coded to a [String] value.
   */
  var createdAt: Int = -1
)
