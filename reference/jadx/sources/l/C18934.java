package l;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: renamed from: l.ᩴᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes5.dex */
public class C18934 extends AbstractC12233 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61253 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Boolean f61254;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8351 f61255;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18062 f61256;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C0237 f61257;

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo10259() {
        return true;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo10271() {
        return true;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo10277() {
        return true;
    }

    public C18934(int i, AbstractC12068 abstractC12068) {
        super(i, abstractC12068);
        this.f61256 = new C18062(new C15407(this), mo24615());
        this.f61255 = C8351.m21852(i, abstractC12068);
    }

    public C18934(int i, AbstractC12068 abstractC12068, C17367 c17367) {
        this(i, abstractC12068);
        Boolean boolM40456 = c17367.m40456();
        this.f61254 = boolM40456;
        if (boolM40456 != null) {
            this.f61256.m42061(boolM40456.booleanValue());
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final void mo10266(AbstractC12068 abstractC12068) {
        super.mo10266(abstractC12068);
        C8351 c8351M21852 = C8351.m21852(this.f40872, abstractC12068);
        if (this.f61255.equals(c8351M21852)) {
            return;
        }
        C12563.m31272(this.f61255);
        this.f61255 = c8351M21852;
        this.f61256.m42059();
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final void mo10274(C11018 c11018) {
        c11018.m27781(this.f61254);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩳ */
    public final String mo10276() {
        return this.f61255.f28941;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩸ */
    public final String mo10279() {
        return this.f61255.f28941;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۠ */
    public final C0237 mo30343() {
        Comparator c23168;
        C0237 c0237 = this.f61257;
        if (c0237 != null) {
            return c0237;
        }
        C4670 c4670M31273 = C12563.m31273(this.f61255);
        try {
            C19640 c19640M23392 = new C9057(c4670M31273).m23392();
            HashMap map = c19640M23392.f63062;
            HashMap map2 = c19640M23392.f63063;
            ArrayList arrayList = new ArrayList(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new C16466((String) entry.getKey(), ((Integer) entry.getValue()).intValue()));
            }
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry entry2 : map.entrySet()) {
                arrayList2.add(new C16466((String) entry2.getKey(), ((Integer) entry2.getValue()).intValue()));
            }
            if (c19640M23392.f63064) {
                c23168 = new C15635(1);
            } else {
                c23168 = new C23168();
            }
            Collections.sort(arrayList, c23168);
            Collections.sort(arrayList2, c23168);
            C0237 c0238 = new C0237(C0561.unmodifiableList(arrayList), C0561.unmodifiableList(arrayList2));
            this.f61257 = c0238;
            C12563.m31270(c4670M31273);
            return c0238;
        } catch (Throwable th) {
            try {
                throw new IOException("Failed to load uid and gid lists", th);
            } catch (Throwable th2) {
                C12563.m31270(c4670M31273);
                throw th2;
            }
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܺ */
    public final void mo10275() {
        C4716.f16635.execute(new RunnableC7856(5, this));
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) {
        this.f61256.m42059();
        if (z) {
            C12563.m31272(this.f61255);
            this.f61257 = null;
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10272(String str) {
        return this.f61256.m42062(str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo10261(String str) {
        C18062 c18062 = this.f61256;
        c18062.getClass();
        return c18062.m42058(C6730.m18172(str), C6730.m18175(str)) != null;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ֨ */
    public final String mo10260(String str) {
        return this.f61256.m42063(str);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) {
        String strM18172 = C6730.m18172(str);
        C14199 c14199 = (C14199) this.f61256.m42058(strM18172, C6730.m18175(str));
        if (c14199 != null) {
            return new C17501(c14199, strM18172);
        }
        return null;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        String strM28608 = AbstractC11462.m28608(str);
        Collection<C14199> collectionValues = this.f61256.m42057(strM28608).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C14199 c14199 : collectionValues) {
            if (z || !c14199.m34298().startsWith(".")) {
                arrayList.add(new C17501(c14199, strM28608));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۜ */
    public final void mo10269(String str) {
        this.f61256.m42060(str);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo24615() {
        return this.f61254 == Boolean.TRUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43613(C18934 c18934, C4670 c4670, Vector vector, String str) throws C12019 {
        String lowerCase;
        HashSet hashSet = new HashSet();
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            hashSet.add(((C14199) it.next()).m34298());
        }
        Iterator it2 = vector.iterator();
        while (it2.hasNext()) {
            C14199 c14199 = (C14199) it2.next();
            if (c14199.m34293().m13752()) {
                String strM34298 = c14199.m34298();
                boolean z = false;
                char cCharAt = strM34298.charAt(0);
                if ('a' <= cCharAt && cCharAt <= 'z') {
                    lowerCase = strM34298.toUpperCase();
                } else if ('A' <= cCharAt && cCharAt <= 'Z') {
                    lowerCase = strM34298.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    try {
                        c4670.m12938(C6730.m18162(str, lowerCase));
                        z = true;
                    } catch (C12019 e) {
                        int i = e.f40261;
                        if (i != 2 && i != 10) {
                            throw e;
                        }
                    }
                    c18934.f61254 = Boolean.valueOf(z);
                    c18934.f61256.m42061(z);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C4670 m43614(C18934 c18934) {
        return C12563.m31273(c18934.f61255);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo10262(long j, String str) {
        C4670 c4670M31273 = C12563.m31273(this.f61255);
        try {
            InputStream inputStreamM12925 = c4670M31273.m12925(j, str);
            return new C21756(this, inputStreamM12925, inputStreamM12925, c4670M31273);
        } catch (IOException | Error | RuntimeException e) {
            C12563.m31270(c4670M31273);
            throw e;
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final void mo30342(int i, int i2, String str) {
        C4670 c4670M31273 = C12563.m31273(this.f61255);
        try {
            C4962 c4962 = new C4962();
            c4962.m13759(i, i2);
            c4670M31273.m12935(str, c4962);
        } finally {
            C12563.m31270(c4670M31273);
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ */
    public final void mo10265(String str, String str2) {
        C4670 c4670M31273 = C12563.m31273(this.f61255);
        try {
            c4670M31273.m12927(str, str2);
        } finally {
            C12563.m31270(c4670M31273);
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۚ */
    public final void mo10268(String str) {
        C4670 c4670M31273 = C12563.m31273(this.f61255);
        try {
            try {
                C4962 c4962 = new C4962();
                c4962.m13754(448);
                c4670M31273.m12928(str, c4962);
                C12563.m31270(c4670M31273);
            } catch (C12019 e) {
                if (e.f40261 == 4) {
                    try {
                        if (c4670M31273.m12938(str).m13760()) {
                            C12563.m31270(c4670M31273);
                            return;
                        }
                    } catch (C12019 unused) {
                    }
                }
                throw e;
            }
        } catch (Throwable th) {
            C12563.m31270(c4670M31273);
            throw th;
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۨ */
    public final void mo30344(long j, String str) {
        C4670 c4670M31273 = C12563.m31273(this.f61255);
        try {
            C4962 c4962 = new C4962();
            int i = (int) (j / 1000);
            c4962.m13755(i, i);
            c4670M31273.m12935(str, c4962);
        } finally {
            C12563.m31270(c4670M31273);
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۨ */
    public final void mo10270(String str, boolean z) {
        C4670 c4670M31273 = C12563.m31273(this.f61255);
        try {
            if (z) {
                c4670M31273.m12931(str);
            } else {
                c4670M31273.m12924(str);
            }
            C12563.m31270(c4670M31273);
        } catch (Throwable th) {
            C12563.m31270(c4670M31273);
            throw th;
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final OutputStream mo10273(long j, String str) {
        C4670 c4670M31273 = C12563.m31273(this.f61255);
        try {
            return new C18228(this, c4670M31273.m12934(str), c4670M31273);
        } catch (IOException | Error | RuntimeException e) {
            C12563.m31270(c4670M31273);
            throw e;
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final void mo30346(int i, String str) {
        C4670 c4670M31273 = C12563.m31273(this.f61255);
        try {
            C4962 c4962 = new C4962();
            c4962.m13754(i);
            c4670M31273.m12935(str, c4962);
        } finally {
            C12563.m31270(c4670M31273);
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo30347(String str, String str2) {
        C4670 c4670M31273 = C12563.m31273(this.f61255);
        try {
            c4670M31273.m12927(str, str2);
            return true;
        } catch (C12019 unused) {
            return false;
        } finally {
            C12563.m31270(c4670M31273);
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩷ */
    public final String mo10278() {
        C4670 c4670M31273 = C12563.m31273(this.f61255);
        try {
            String str = this.f40874.f40395;
            if (!TextUtils.isEmpty(str)) {
                return AbstractC11462.m28608(str);
            }
            return AbstractC11462.m28608(c4670M31273.m12937());
        } finally {
            C12563.m31270(c4670M31273);
        }
    }
}
