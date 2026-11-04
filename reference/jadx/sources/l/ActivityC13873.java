package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9RZ */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC13873 extends AbstractActivityC10144 {

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public C24067 f44002;

    @Override // l.AbstractActivityC10144
    /* JADX INFO: renamed from: ۚۙ */
    public final boolean mo26247() {
        return true;
    }

    @Override // l.AbstractActivityC10144
    /* JADX INFO: renamed from: ܳۙ */
    public final String mo26253() {
        return "INTERNAL:ArscTranslationEditor";
    }

    @Override // l.AbstractActivityC10144
    /* JADX INFO: renamed from: ܺۙ */
    public final boolean mo26254() {
        return true;
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public String mo122() {
        return "ArscConfigTranslationMode";
    }

    @Override // l.AbstractActivityC10144
    /* JADX INFO: renamed from: ᩷ۙ */
    public final boolean mo26257() {
        return true;
    }

    @Override // l.AbstractActivityC10144
    /* JADX INFO: renamed from: ᩷ */
    public void mo19737(boolean z) {
        int i = C14584.f45961;
        this.f44002 = new C24067(C14584.m35190(getIntent()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractActivityC10144
    /* JADX INFO: renamed from: ᩻ۙ */
    public void mo19738() {
        ArrayList arrayList = new ArrayList(this.f44002.size());
        int size = this.f44002.size();
        for (int i = 0; i < size; i++) {
            C3929 c3929 = (C3929) this.f44002.get(i);
            C11636 c11636 = new C11636(c3929.f13418, i, c3929.f13416, false);
            c11636.f36482 = c3929.f13419;
            arrayList.add(c11636);
        }
        m26246(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractActivityC10144
    /* JADX INFO: renamed from: ۙ */
    public void mo19736(RunnableC23571 runnableC23571) {
        ArrayList arrayListM26252 = m26252();
        if (arrayListM26252.size() != this.f44002.size()) {
            throw new IllegalStateException();
        }
        int size = arrayListM26252.size();
        for (int i = 0; i < size; i++) {
            C11636 c11636 = (C11636) arrayListM26252.get(i);
            ((C3929) this.f44002.get(i)).f13419 = c11636.f36482;
        }
        try {
            this.f44002.m53615();
            runnableC23571.run();
        } catch (IOException e) {
            m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractActivityC10144
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo26249(String str) {
        if (str != null && (str.contains("<") || str.contains(a.p))) {
            try {
                C19205 c19205 = new C19205();
                c19205.m44493(new StringReader(str));
                do {
                } while (c19205.m44501() != 1);
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractActivityC10144
    /* JADX INFO: renamed from: ᩸ */
    public final CharSequence mo26258(String str) {
        if (str == null) {
            return null;
        }
        int iMin = Math.min(str.length(), 200);
        for (int i = 0; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '<' || cCharAt == '&') {
                return C2981.m9701(str);
            }
        }
        return str;
    }

    @Override // l.AbstractActivityC10144
    /* JADX INFO: renamed from: ۧۙ */
    public final void mo26251() {
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8016();
    }

    @Override // l.AbstractActivityC10144
    /* JADX INFO: renamed from: ۤۙ */
    public final String mo26250() {
        String strTrim = getString(R.string.MT_Protector).trim();
        String string = getString(R.string.MT_Protector);
        if (strTrim.endsWith(".")) {
            return strTrim.substring(0, strTrim.length() - 1) + ", " + string;
        }
        if (!strTrim.endsWith("。")) {
            return C20196.m46451(strTrim, ", ", string);
        }
        return strTrim.substring(0, strTrim.length() - 1) + "，" + string;
    }
}
