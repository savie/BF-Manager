package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9RZ */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC2965 extends AbstractActivityC5788 {

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public C7232 f11101;

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8785() {
        return true;
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final String mo8788() {
        return "INTERNAL:ArscTranslationEditor";
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public String mo126() {
        return "ArscConfigTranslationMode";
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8791() {
        return true;
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo8792() {
        return true;
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ۙ */
    public void mo1990(boolean z) {
        int i = C5553.f19060;
        this.f11101 = new C7232(C5553.m15309(getIntent()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ᩹ۙ */
    public void mo1991() {
        ArrayList arrayList = new ArrayList(this.f11101.size());
        int size = this.f11101.size();
        for (int i = 0; i < size; i++) {
            C20638 c20638 = (C20638) this.f11101.get(i);
            C22722 c22722 = new C22722(c20638.f67205, i, c20638.f67204, false);
            c22722.f74020 = c20638.f67201;
            arrayList.add(c22722);
        }
        m15955(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ۙ */
    public void mo1989(RunnableC18488 runnableC18488) {
        ArrayList arrayListM15958 = m15958();
        if (arrayListM15958.size() != this.f11101.size()) {
            throw new IllegalStateException();
        }
        int size = arrayListM15958.size();
        for (int i = 0; i < size; i++) {
            C22722 c22722 = (C22722) arrayListM15958.get(i);
            ((C20638) this.f11101.get(i)).f67201 = c22722.f74020;
        }
        try {
            this.f11101.m19261();
            runnableC18488.run();
        } catch (IOException e) {
            m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo8790(String str) {
        if (str != null && (str.contains("<") || str.contains(a.p))) {
            try {
                C3504 c3504 = new C3504();
                c3504.m10317(new StringReader(str));
                do {
                } while (c3504.m10327() != 1);
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo8787(String str) {
        if (str == null) {
            return null;
        }
        int iMin = Math.min(str.length(), 200);
        for (int i = 0; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '<' || cCharAt == '&') {
                return C18211.m42330(str);
            }
        }
        return str;
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final void mo8789() {
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21269();
    }

    @Override // l.AbstractActivityC5788
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo8786() {
        String strTrim = getString(R.string.MT_Protector).trim();
        String string = getString(R.string.MT_Protector);
        if (strTrim.endsWith(".")) {
            return strTrim.substring(0, strTrim.length() - 1) + ", " + string;
        }
        if (!strTrim.endsWith("。")) {
            return C1679.m5594(strTrim, ", ", string);
        }
        return strTrim.substring(0, strTrim.length() - 1) + "，" + string;
    }
}
