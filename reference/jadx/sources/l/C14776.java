package l;

import android.text.TextUtils;
import com.google.android.material.slider.BaseSlider;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: VA36 */
/* JADX INFO: loaded from: classes.dex */
public class C14776 extends AbstractC18881 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C4274 f48346;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f48347 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Boolean f48348;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f48349;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C21490 f48350;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C5947 f48351;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16312 f48352;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private native void m35562();

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean mo35574() {
        return false;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo35578() {
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo35581() {
        return false;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean mo35583() {
        return false;
    }

    public C14776(int i, AbstractC0148 abstractC0148) {
        super(i, abstractC0148);
        this.f48349 = true;
        this.f48352 = new C16312(new C4336(this), true);
        this.f48350 = C21490.m48894(i, abstractC0148);
        m35562();
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35572(AbstractC0148 abstractC0148) {
        super.mo35572(abstractC0148);
        C21490 c21490M48894 = C21490.m48894(this.f61288, abstractC0148);
        if (this.f48350.equals(c21490M48894)) {
            return;
        }
        this.f48350 = c21490M48894;
        m35562();
        this.f48352.m38698();
    }

    public C14776(int i, AbstractC0148 abstractC0148, C20348 c20348) {
        this(i, abstractC0148);
        this.f48349 = c20348.m46753();
        Boolean boolM46761 = c20348.m46761();
        this.f48348 = boolM46761;
        if (boolM46761 != null) {
            this.f48352.m38700(boolM46761.booleanValue());
        }
        this.f48351.m17317(c20348.m46742());
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo35585(C6178 c6178) {
        c6178.m17789(this.f48349);
        c6178.m17785(this.f48348);
        c6178.m17787(this.f48351.m17318());
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String mo35579() {
        return this.f48350.f68705;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo35580() {
        return AbstractC18881.m43782(this.f48350.f68705);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String mo35569() {
        return TextUtils.isEmpty(this.f61289.f1128) ? "/" : AbstractC7364.m20187(this.f61289.f1128);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
        this.f48352.m38698();
        if (z) {
            this.f48351.m17312();
        }
    }

    static {
        ApplicationC23172.m52091(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION);
        f48346 = new C4274();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String m35566(String str) {
        boolean zStartsWith = str.startsWith("/");
        C4274 c4274 = f48346;
        if (zStartsWith) {
            return this.f48350.f68705 + c4274.m13626(str);
        }
        return this.f48350.f68705 + "/" + c4274.m13626(str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean mo35568() {
        return this.f48349;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo35570(long j, String str) throws C2218 {
        try {
            return this.f48351.m17310(j, m35566(str));
        } catch (C2218 e) {
            this.f48349 = false;
            throw e;
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final OutputStream mo35584(long j, String str) {
        String strM23965 = C8969.m23965(C11293.m28558(str));
        if (strM23965.indexOf(42) != -1) {
            strM23965 = "application/octet-stream";
        }
        return this.f48351.m17311(m35566(str), strM23965, j);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo35575(String str, boolean z) throws C11912, C14908 {
        try {
            if (z) {
                this.f48351.m17319(m35566(str) + "/");
                return;
            }
            this.f48351.m17319(m35566(str));
        } catch (C11912 e) {
            if (e.m29864() == 405) {
                throw new C14908(e);
            }
            throw e;
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35571(String str, String str2) {
        this.f48351.m17314(m35566(str), m35566(str2));
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo35582(String str) {
        this.f48351.m17313(m35566(str));
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo35573(String str) {
        return this.f48352.m38701(str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo35586(String str) {
        C16312 c16312 = this.f48352;
        c16312.getClass();
        return c16312.m38697(C11293.m28556(str), C11293.m28558(str)) != null;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String mo35577(String str) {
        return this.f48352.m38702(str);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        String strM28556 = C11293.m28556(str);
        C7087 c7087 = (C7087) this.f48352.m38697(strM28556, C11293.m28558(str));
        if (c7087 != null) {
            return new C11793(c7087, strM28556);
        }
        return null;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        String strM20187 = AbstractC7364.m20187(str);
        Collection<C7087> collectionValues = this.f48352.m38703(strM20187).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C7087 c7087 : collectionValues) {
            if (z || !c7087.m19422().startsWith(".")) {
                arrayList.add(new C11793(c7087, strM20187));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo35576(String str) {
        this.f48352.m38699(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35565(C14776 c14776, List list, String str) {
        String lowerCase;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((C7087) it.next()).m19422());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C7087 c7087 = (C7087) it2.next();
            if (!c7087.m19424()) {
                String strM19422 = c7087.m19422();
                char cCharAt = strM19422.charAt(0);
                if ('a' <= cCharAt && cCharAt <= 'z') {
                    lowerCase = strM19422.toUpperCase();
                } else if ('A' <= cCharAt && cCharAt <= 'Z') {
                    lowerCase = strM19422.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    if (c14776.f48351.m17316(c14776.m35566(C11293.m28549(str, lowerCase)))) {
                        c14776.f48348 = Boolean.TRUE;
                    } else {
                        c14776.f48348 = Boolean.FALSE;
                    }
                    c14776.f48352.m38700(c14776.f48348.booleanValue());
                    return;
                }
            }
        }
    }
}
