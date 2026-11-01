package l;

import android.text.TextUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: VA36 */
/* JADX INFO: loaded from: classes.dex */
public class C7356 extends AbstractC12233 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24422 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C0105 f24423;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C11229 f24424;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Boolean f24425;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f24426;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18062 f24427;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C20762 f24428;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private native void m19629();

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo10259() {
        return false;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo10271() {
        return false;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܺ */
    public final void mo10275() {
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo10277() {
        return false;
    }

    public C7356(int i, AbstractC12068 abstractC12068) {
        super(i, abstractC12068);
        this.f24426 = true;
        this.f24427 = new C18062(new C10179(this), true);
        this.f24428 = C20762.m46761(i, abstractC12068);
        m19629();
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final void mo10266(AbstractC12068 abstractC12068) {
        super.mo10266(abstractC12068);
        C20762 c20762M46761 = C20762.m46761(this.f40872, abstractC12068);
        if (this.f24428.equals(c20762M46761)) {
            return;
        }
        this.f24428 = c20762M46761;
        m19629();
        this.f24427.m42059();
    }

    public C7356(int i, AbstractC12068 abstractC12068, C17367 c17367) {
        this(i, abstractC12068);
        this.f24426 = c17367.m40461();
        Boolean boolM40456 = c17367.m40456();
        this.f24425 = boolM40456;
        if (boolM40456 != null) {
            this.f24427.m42061(boolM40456.booleanValue());
        }
        this.f24424.m28202(c17367.m40448());
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final void mo10274(C11018 c11018) {
        c11018.m27784(this.f24426);
        c11018.m27781(this.f24425);
        c11018.m27783(this.f24424.m28204());
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩳ */
    public final String mo10276() {
        return this.f24428.f67561;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩸ */
    public final String mo10279() {
        return AbstractC12233.m30338(this.f24428.f67561);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩷ */
    public final String mo10278() {
        return TextUtils.isEmpty(this.f40874.f40395) ? "/" : AbstractC11462.m28608(this.f40874.f40395);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) {
        this.f24427.m42059();
        if (z) {
            this.f24424.m28198();
        }
    }

    static {
        ApplicationC6132.m17119(93);
        f24423 = new C0105();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String m19631(String str) {
        boolean zStartsWith = str.startsWith("/");
        C0105 c0105 = f24423;
        if (zStartsWith) {
            return this.f24428.f67561 + c0105.m1135(str);
        }
        return this.f24428.f67561 + "/" + c0105.m1135(str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo19632() {
        return this.f24426;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo10262(long j, String str) throws C23929 {
        try {
            return this.f24424.m28196(j, m19631(str));
        } catch (C23929 e) {
            this.f24426 = false;
            throw e;
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final OutputStream mo10273(long j, String str) {
        String strM48172 = C21512.m48172(C6730.m18175(str));
        if (strM48172.indexOf(42) != -1) {
            strM48172 = "application/octet-stream";
        }
        return this.f24424.m28197(m19631(str), strM48172, j);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۨ */
    public final void mo10270(String str, boolean z) throws C11278, C14757 {
        try {
            if (z) {
                this.f24424.m28205(m19631(str) + "/");
                return;
            }
            this.f24424.m28205(m19631(str));
        } catch (C14757 e) {
            if (e.m35376() == 405) {
                throw new C11278(e);
            }
            throw e;
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final void mo10265(String str, String str2) {
        this.f24424.m28200(m19631(str), m19631(str2));
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۚ */
    public final void mo10268(String str) {
        this.f24424.m28199(m19631(str));
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10272(String str) {
        return this.f24427.m42062(str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo10261(String str) {
        C18062 c18062 = this.f24427;
        c18062.getClass();
        return c18062.m42058(C6730.m18172(str), C6730.m18175(str)) != null;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ֨ */
    public final String mo10260(String str) {
        return this.f24427.m42063(str);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) {
        String strM18172 = C6730.m18172(str);
        C7701 c7701 = (C7701) this.f24427.m42058(strM18172, C6730.m18175(str));
        if (c7701 != null) {
            return new C22879(c7701, strM18172);
        }
        return null;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        String strM28608 = AbstractC11462.m28608(str);
        Collection<C7701> collectionValues = this.f24427.m42057(strM28608).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C7701 c7701 : collectionValues) {
            if (z || !c7701.m20334().startsWith(".")) {
                arrayList.add(new C22879(c7701, strM28608));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۜ */
    public final void mo10269(String str) {
        this.f24427.m42060(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19628(C7356 c7356, List list, String str) {
        String lowerCase;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((C7701) it.next()).m20334());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C7701 c7701 = (C7701) it2.next();
            if (!c7701.m20332()) {
                String strM20334 = c7701.m20334();
                char cCharAt = strM20334.charAt(0);
                if ('a' <= cCharAt && cCharAt <= 'z') {
                    lowerCase = strM20334.toUpperCase();
                } else if ('A' <= cCharAt && cCharAt <= 'Z') {
                    lowerCase = strM20334.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    if (c7356.f24424.m28203(c7356.m19631(C6730.m18162(str, lowerCase)))) {
                        c7356.f24425 = Boolean.TRUE;
                    } else {
                        c7356.f24425 = Boolean.FALSE;
                    }
                    c7356.f24427.m42061(c7356.f24425.booleanValue());
                    return;
                }
            }
        }
    }
}
