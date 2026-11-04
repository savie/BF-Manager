package l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import com.tencent.connect.auth.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۚۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC5422 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f18914;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C12879 f18915;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5422(a aVar, C12879 c12879, Looper looper) {
        super(looper);
        this.f18914 = aVar;
        this.f18915 = c12879;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        C12879 c12879 = this.f18915;
        if (i == 1) {
            String str = (String) message.obj;
            c12879.getClass();
            try {
                c12879.mo2048(C20512.m47044(str));
                return;
            } catch (JSONException unused) {
                c12879.mo2047(new C1121(-4, "服务器返回数据格式有误!", str));
                return;
            }
        }
        if (i == 2) {
            c12879.mo2046();
            return;
        }
        if (i != 3) {
            return;
        }
        Context context = this.f18914.f864;
        try {
            JSONObject jSONObjectM47044 = C20512.m47044((String) message.obj);
            int i2 = jSONObjectM47044.getInt("type");
            Toast.makeText(context.getApplicationContext(), jSONObjectM47044.getString("msg"), i2).show();
        } catch (JSONException unused2) {
        }
    }
}
