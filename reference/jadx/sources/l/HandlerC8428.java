package l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import com.tencent.open.TDialog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۠᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC8428 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TDialog f29276;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19011 f29277;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8428(TDialog tDialog, C19011 c19011, Looper looper) {
        super(looper);
        this.f29276 = tDialog;
        this.f29277 = c19011;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C23099.m51110("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + message.what);
        int i = message.what;
        C19011 c19011 = this.f29277;
        if (i == 1) {
            String str = (String) message.obj;
            c19011.getClass();
            try {
                c19011.mo16215(C2761.m8423(str));
                return;
            } catch (JSONException unused) {
                c19011.mo16214(new C8407(-4, "服务器返回数据格式有误!", str));
                return;
            }
        }
        if (i == 2) {
            c19011.mo16213();
            return;
        }
        TDialog tDialog = this.f29276;
        if (i != 3) {
            if (i != 5 || tDialog.f898 == null || tDialog.f898.get() == null) {
                return;
            }
            TDialog.m921((Context) tDialog.f898.get(), (String) message.obj);
            return;
        }
        if (tDialog.f898 == null || tDialog.f898.get() == null) {
            return;
        }
        Context context = (Context) tDialog.f898.get();
        try {
            JSONObject jSONObjectM8423 = C2761.m8423((String) message.obj);
            int i2 = jSONObjectM8423.getInt("type");
            String string = jSONObjectM8423.getString("msg");
            if (i2 == 0) {
                Toast toast = TDialog.f895;
                if (toast == null) {
                    TDialog.f895 = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    TDialog.f895.setText(string);
                    TDialog.f895.setDuration(0);
                }
                TDialog.f895.show();
                return;
            }
            if (i2 == 1) {
                Toast toast2 = TDialog.f895;
                if (toast2 == null) {
                    TDialog.f895 = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    TDialog.f895.setText(string);
                    TDialog.f895.setDuration(1);
                }
                TDialog.f895.show();
            }
        } catch (JSONException unused2) {
        }
    }
}
