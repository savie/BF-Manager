package l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import com.tencent.connect.auth.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩻۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC23557 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f76285;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C10857 f76286;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC23557(a aVar, C10857 c10857, Looper looper) {
        super(looper);
        this.f76285 = aVar;
        this.f76286 = c10857;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        C10857 c10857 = this.f76286;
        if (i == 1) {
            String str = (String) message.obj;
            c10857.getClass();
            try {
                c10857.mo16215(C2761.m8423(str));
                return;
            } catch (JSONException unused) {
                c10857.mo16214(new C8407(-4, "服务器返回数据格式有误!", str));
                return;
            }
        }
        if (i == 2) {
            c10857.mo16213();
            return;
        }
        if (i != 3) {
            return;
        }
        Context context = this.f76285.f869;
        try {
            JSONObject jSONObjectM8423 = C2761.m8423((String) message.obj);
            int i2 = jSONObjectM8423.getInt("type");
            Toast.makeText(context.getApplicationContext(), jSONObjectM8423.getString("msg"), i2).show();
        } catch (JSONException unused2) {
        }
    }
}
