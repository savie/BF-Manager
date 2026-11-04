package l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import com.tencent.open.TDialog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۢۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9895 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TDialog f31818;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18846 f31819;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC9895(TDialog tDialog, C18846 c18846, Looper looper) {
        super(looper);
        this.f31818 = tDialog;
        this.f31819 = c18846;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C21587.m49111("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + message.what);
        int i = message.what;
        C18846 c18846 = this.f31819;
        if (i == 1) {
            String str = (String) message.obj;
            c18846.getClass();
            try {
                c18846.mo2048(C20512.m47044(str));
                return;
            } catch (JSONException unused) {
                c18846.mo2047(new C1121(-4, "服务器返回数据格式有误!", str));
                return;
            }
        }
        if (i == 2) {
            c18846.mo2046();
            return;
        }
        TDialog tDialog = this.f31818;
        if (i != 3) {
            if (i != 5 || tDialog.f893 == null || tDialog.f893.get() == null) {
                return;
            }
            TDialog.m915((Context) tDialog.f893.get(), (String) message.obj);
            return;
        }
        if (tDialog.f893 == null || tDialog.f893.get() == null) {
            return;
        }
        Context context = (Context) tDialog.f893.get();
        try {
            JSONObject jSONObjectM47044 = C20512.m47044((String) message.obj);
            int i2 = jSONObjectM47044.getInt("type");
            String string = jSONObjectM47044.getString("msg");
            if (i2 == 0) {
                Toast toast = TDialog.f887;
                if (toast == null) {
                    TDialog.f887 = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    TDialog.f887.setText(string);
                    TDialog.f887.setDuration(0);
                }
                TDialog.f887.show();
                return;
            }
            if (i2 == 1) {
                Toast toast2 = TDialog.f887;
                if (toast2 == null) {
                    TDialog.f887 = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    TDialog.f887.setText(string);
                    TDialog.f887.setDuration(1);
                }
                TDialog.f887.show();
            }
        } catch (JSONException unused2) {
        }
    }
}
