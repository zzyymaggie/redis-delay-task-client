// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.example.zzyymaggie.protocol.task;

import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.annotation.*;
import com.qq.tars.common.support.Holder;

@Servant
public interface FeedbackPrx {

	public int feedback(TaskInfoReq taskInfoReq, @TarsHolder Holder<String> msg);

	public int feedback(TaskInfoReq taskInfoReq, @TarsHolder Holder<String> msg, @TarsContext java.util.Map<String, String> ctx);

	public void async_feedback(@TarsCallback FeedbackPrxCallback callback, TaskInfoReq taskInfoReq);

	public void async_feedback(@TarsCallback FeedbackPrxCallback callback, TaskInfoReq taskInfoReq, @TarsContext java.util.Map<String, String> ctx);
}
