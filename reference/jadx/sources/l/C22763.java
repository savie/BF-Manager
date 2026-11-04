package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۧ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 770P */
/* JADX INFO: loaded from: classes.dex */
public final class C22763 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f73859;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17036 f73860;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f73861;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24727 f73862;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f73863;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f73864;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f73865;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51339(AbstractC22044 abstractC22044, byte[] bArr) {
        m51338(abstractC22044);
        Iterator it = m51337(abstractC22044, bArr).iterator();
        while (it.hasNext()) {
            m51338((AbstractC22044) it.next());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51340(AbstractC22044 abstractC22044) {
        C17359.requireNonNull(abstractC22044);
        String strMo4294 = abstractC22044.mo4294();
        if (this.f73861.remove(strMo4294)) {
            String strM51334 = m51334(strMo4294);
            HashMap map = this.f73859;
            int iIntValue = ((Integer) map.get(strM51334)).intValue();
            if (iIntValue == 1) {
                map.remove(strM51334);
            } else {
                map.put(strM51334, Integer.valueOf(iIntValue - 1));
            }
            if (this.f73863.remove(strMo4294)) {
                HashMap map2 = this.f73865;
                int iIntValue2 = ((Integer) map2.get(strM51334)).intValue();
                if (iIntValue2 == 1) {
                    map2.remove(strM51334);
                } else {
                    map2.put(strM51334, Integer.valueOf(iIntValue2 - 1));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m51341(AbstractC22044 abstractC22044) {
        C17359.requireNonNull(abstractC22044);
        m51336();
        boolean z = false;
        if (this.f73861.isEmpty()) {
            return false;
        }
        String strMo4294 = abstractC22044.mo4294();
        if (!this.f73861.contains(strMo4294)) {
            HashMap map = this.f73862.test(strMo4294) ? this.f73859 : this.f73865;
            if (!map.isEmpty() && map.containsKey(m51334(strMo4294))) {
            }
            return z;
        }
        z = true;
        return z;
    }

    public C22763() {
        C24727 c24727 = new C24727(1);
        this.f73861 = new LinkedHashSet();
        this.f73863 = new HashSet();
        this.f73859 = new HashMap();
        this.f73865 = new HashMap();
        this.f73864 = Long.MIN_VALUE;
        this.f73862 = c24727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22763 m51335(AbstractC7629 abstractC7629) {
        C17359.requireNonNull(abstractC7629);
        C22763 c22763 = new C22763();
        if (abstractC7629 instanceof C24320) {
            C24320 c24320 = (C24320) abstractC7629;
            c22763.m51339(c24320.m54371(), c24320.m54362());
            return c22763;
        }
        if (abstractC7629 instanceof C11312) {
            C11312 c11312 = (C11312) abstractC7629;
            Iterator it = c11312.m28598().m31759().iterator();
            while (it.hasNext()) {
                c22763.m51338((AbstractC22044) it.next());
            }
            c22763.m51338(c11312.m28595());
            return c22763;
        }
        if (abstractC7629 instanceof C17036) {
            c22763.f73860 = (C17036) abstractC7629;
            c22763.m51336();
            return c22763;
        }
        if (abstractC7629 instanceof C9577) {
            c22763.m51338(((C9577) abstractC7629).m25012());
            return c22763;
        }
        if (abstractC7629 instanceof C12276) {
            C12276 c12276 = (C12276) abstractC7629;
            if (!c12276.m30662()) {
                c22763.m51338(c12276.m30659());
            }
        }
        return c22763;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m51337(AbstractC22044 abstractC22044, byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return Collections.singletonList(abstractC22044);
        }
        try {
            C20348 c20348 = new C20348(bArr);
            int i = c20348.readInt();
            int length = (bArr.length - 4) / 9;
            if (i <= 0 || i > length) {
                throw new IOException("Invalid ZIP split volume count: " + i);
            }
            AbstractC22044 abstractC22044M49856 = abstractC22044.m49856();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(abstractC22044M49856.m49876(c20348.m46758()));
                c20348.skipBytes(8);
            }
            return arrayList;
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new IOException("Invalid ZIP split metadata", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51336() {
        C17036 c17036 = this.f73860;
        if (c17036 == null) {
            return;
        }
        long jM40132 = c17036.m40132();
        if (this.f73864 == jM40132) {
            return;
        }
        Iterator it = this.f73860.m40146().iterator();
        while (it.hasNext()) {
            m51338((AbstractC22044) it.next());
        }
        this.f73864 = jM40132;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m51334(String str) {
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            char lowerCase = Character.toLowerCase(Character.toUpperCase(cCharAt));
            if (sb == null && lowerCase != cCharAt) {
                sb = new StringBuilder(str.length());
                sb.append((CharSequence) str, 0, i);
            }
            if (sb != null) {
                sb.append(lowerCase);
            }
        }
        return sb == null ? str : sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51338(AbstractC22044 abstractC22044) {
        C17359.requireNonNull(abstractC22044);
        String strMo4294 = abstractC22044.mo4294();
        if (this.f73861.add(strMo4294)) {
            String strM51334 = m51334(strMo4294);
            C11392.merge(this.f73859, strM51334, 1, new C10828());
            if (this.f73862.test(strMo4294)) {
                this.f73863.add(strMo4294);
                C11392.merge(this.f73865, strM51334, 1, new C10828());
            }
        }
    }
}
