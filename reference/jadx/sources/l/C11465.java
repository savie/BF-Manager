package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۨۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 770P */
/* JADX INFO: loaded from: classes3.dex */
public final class C11465 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f38596;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f38597;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f38598;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashSet f38599;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21920 f38600;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f38601;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1241 f38602;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28648(AbstractC20745 abstractC20745) {
        C13638.requireNonNull(abstractC20745);
        String strMo33986 = abstractC20745.mo33986();
        if (this.f38596.remove(strMo33986)) {
            String strM28643 = m28643(strMo33986);
            HashMap map = this.f38598;
            int iIntValue = ((Integer) map.get(strM28643)).intValue();
            if (iIntValue == 1) {
                map.remove(strM28643);
            } else {
                map.put(strM28643, Integer.valueOf(iIntValue - 1));
            }
            if (this.f38599.remove(strMo33986)) {
                HashMap map2 = this.f38597;
                int iIntValue2 = ((Integer) map2.get(strM28643)).intValue();
                if (iIntValue2 == 1) {
                    map2.remove(strM28643);
                } else {
                    map2.put(strM28643, Integer.valueOf(iIntValue2 - 1));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m28649(AbstractC20745 abstractC20745) {
        C13638.requireNonNull(abstractC20745);
        m28645();
        boolean z = false;
        if (this.f38596.isEmpty()) {
            return false;
        }
        String strMo33986 = abstractC20745.mo33986();
        if (!this.f38596.contains(strMo33986)) {
            HashMap map = this.f38602.test(strMo33986) ? this.f38598 : this.f38597;
            if (!map.isEmpty() && map.containsKey(m28643(strMo33986))) {
            }
            return z;
        }
        z = true;
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28647(AbstractC20745 abstractC20745, byte[] bArr) {
        m28646(abstractC20745);
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            C17367 c17367 = new C17367(bArr);
            int i = c17367.readInt();
            int length = (bArr.length - 4) / 9;
            if (i <= 0 || i > length) {
                throw new IOException("Invalid ZIP split volume count: " + i);
            }
            AbstractC20745 abstractC20745M46711 = abstractC20745.m46711();
            for (int i2 = 0; i2 < i; i2++) {
                m28646(abstractC20745M46711.m46690(c17367.m40458()));
                c17367.skipBytes(8);
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new IOException("Invalid ZIP split metadata", e);
        }
    }

    public C11465() {
        C1241 c1241 = new C1241(1);
        this.f38596 = new LinkedHashSet();
        this.f38599 = new HashSet();
        this.f38598 = new HashMap();
        this.f38597 = new HashMap();
        this.f38601 = Long.MIN_VALUE;
        this.f38602 = c1241;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11465 m28644(AbstractC9677 abstractC9677) {
        C13638.requireNonNull(abstractC9677);
        C11465 c11465 = new C11465();
        if (abstractC9677 instanceof C8289) {
            C8289 c8289 = (C8289) abstractC9677;
            c11465.m28647(c8289.m21723(), c8289.m21725());
            return c11465;
        }
        if (abstractC9677 instanceof C5445) {
            C5445 c5445 = (C5445) abstractC9677;
            c11465.m28646(c5445.m15083());
            c11465.m28646(c5445.m15076());
            return c11465;
        }
        if (abstractC9677 instanceof C21920) {
            c11465.f38600 = (C21920) abstractC9677;
            c11465.m28645();
            return c11465;
        }
        if (abstractC9677 instanceof C14865) {
            c11465.m28646(((C14865) abstractC9677).m35542());
            return c11465;
        }
        if (abstractC9677 instanceof C8809) {
            C8809 c8809 = (C8809) abstractC9677;
            if (!c8809.m22936()) {
                c11465.m28646(c8809.m22931());
            }
        }
        return c11465;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28645() {
        C21920 c21920 = this.f38600;
        if (c21920 == null) {
            return;
        }
        long jM48738 = c21920.m48738();
        if (this.f38601 == jM48738) {
            return;
        }
        Iterator it = this.f38600.m48743().iterator();
        while (it.hasNext()) {
            m28646((AbstractC20745) it.next());
        }
        this.f38601 = jM48738;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28643(String str) {
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
    public final synchronized void m28646(AbstractC20745 abstractC20745) {
        C13638.requireNonNull(abstractC20745);
        String strMo33986 = abstractC20745.mo33986();
        if (this.f38596.add(strMo33986)) {
            String strM28643 = m28643(strMo33986);
            C9735.merge(this.f38598, strM28643, 1, new C13582());
            if (this.f38602.test(strMo33986)) {
                this.f38599.add(strMo33986);
                C9735.merge(this.f38597, strM28643, 1, new C13582());
            }
        }
    }
}
