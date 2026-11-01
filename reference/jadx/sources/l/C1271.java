package l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.alipay.sdk.m.u0.b;

/* JADX INFO: renamed from: l.֨ܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P1U8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1271 implements InterfaceC23145 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f5501;

    public /* synthetic */ C1271(Object obj) {
        this.f5501 = obj;
    }

    @Override // l.InterfaceC23145
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo4603(C12417 c12417) {
        c12417.m2210((C15384) this.f5501);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m4602(int i, String str) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        String string = null;
        if (i == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else if (i == 1) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str);
        } else if (i == 2) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str);
        } else {
            if (i != 4) {
                uri2 = null;
            } else {
                uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
            }
            cursorQuery = ((Context) this.f5501).getContentResolver().query(uri2, null, null, null, null);
            if (cursorQuery != null) {
                string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex(b.d)) : null;
                cursorQuery.close();
            }
            return string;
        }
        uri2 = uri;
        cursorQuery = ((Context) this.f5501).getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToNext()) {
            }
            cursorQuery.close();
        }
        return string;
    }
}
