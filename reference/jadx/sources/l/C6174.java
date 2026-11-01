package l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.BaseAdapter;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۛܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6174 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23814 f21033;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f21034;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f21035;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f21036;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f21037 = false;

    public C6174(C23814 c23814, AbstractActivityC12483 abstractActivityC12483, AbstractC20745 abstractC20745, String str) {
        this.f21033 = c23814;
        this.f21036 = abstractActivityC12483;
        this.f21034 = abstractC20745;
        this.f21035 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        final AbstractActivityC12483 abstractActivityC12483 = this.f21036;
        C16737.m39267(200L, new Runnable() { // from class: l.ܿܽۘ
            @Override // java.lang.Runnable
            public final void run() {
                C6174.m17180(this.f55570, abstractActivityC12483);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17180(C6174 c6174, AbstractActivityC12483 abstractActivityC12483) {
        if (c6174.f21037) {
            return;
        }
        c6174.m10246(abstractActivityC12483, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C22356, IOException {
        AbstractC20745 abstractC20745 = this.f21034;
        boolean zM46729 = abstractC20745.m46729();
        String strM46718 = null;
        C23814 c23814 = this.f21033;
        if (zM46729) {
            Typeface typefaceCreateFromFile = Typeface.createFromFile(this.f21035);
            if (typefaceCreateFromFile == null || typefaceCreateFromFile == Typeface.DEFAULT) {
                throw new C22356(R.string.MT_Protector);
            }
            abstractC20745.m46701(c23814.f77002.f37727, (C5222) null, (InterfaceC8978) null);
            c23814.f77002.f37725 = true;
        } else {
            abstractC20745.m46701(c23814.f77002.f37727, (C5222) null, (InterfaceC8978) null);
            c23814.f77002.f37725 = true;
            Typeface typefaceCreateFromFile2 = Typeface.createFromFile(c23814.f77002.f37727.mo33986());
            if (typefaceCreateFromFile2 == null || typefaceCreateFromFile2 == Typeface.DEFAULT) {
                throw new C22356(R.string.MT_Protector);
            }
        }
        try {
            InputStream inputStreamMo33970 = c23814.f77002.f37727.mo33970();
            try {
                String strM17620 = C6436.m17619(inputStreamMo33970).m17620(4, c23814.m13133().getResources().getConfiguration().locale);
                if (!TextUtils.isEmpty(strM17620)) {
                    if (inputStreamMo33970 != null) {
                        inputStreamMo33970.close();
                    }
                    strM46718 = strM17620;
                } else if (inputStreamMo33970 != null) {
                    inputStreamMo33970.close();
                }
            } catch (Throwable th) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
        }
        if (strM46718 == null) {
            strM46718 = abstractC20745.m46718();
        }
        c23814.f77002.f37729 = strM46718;
        c23814.f77002.f37726 = C3907.m11362(c23814.f77002.f37727, "MD5");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C23814 c23814 = this.f21033;
        c23814.f77002.m28030();
        String[] strArr = c23814.f77002.f37728;
        int i = c23814.f77002.f37730;
        String strM39288 = c23814.f77002.f37729;
        if (strM39288 == null) {
            strM39288 = C16737.m39288(R.string.MT_Protector);
        }
        strArr[i] = C16737.m39264(R.string.MT_Protector, strM39288);
        ((BaseAdapter) c23814.f77002.f37733.m44376().getAdapter()).notifyDataSetChanged();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (!(exc instanceof IOException)) {
            C15829.m37618(R.string.MT_Protector);
        } else {
            this.f21036.m31002(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f21037 = true;
        m10251();
    }
}
