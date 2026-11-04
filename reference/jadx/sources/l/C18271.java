package l;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܿۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OIUU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18271 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 f59611;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f59612;

    public /* synthetic */ C18271(C21943 c21943, int i) {
        this(c21943);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42421(C18271 c18271, C18271 c18272) {
        c18271.getClass();
        if (c18272.f59611 != c18271.f59611) {
            return;
        }
        c18271.f59612.retainAll(c18272.f59612);
    }

    public C18271(C21943 c21943) {
        this.f59611 = c21943;
        int size = ((ArrayList) c21943.mo1986()).size();
        this.f59612 = new HashSet(size);
        for (int i = 0; i < size; i++) {
            this.f59612.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42422(C18271 c18271, C19017 c19017, int i) {
        HashSet hashSet = c18271.f59612;
        if (c19017.m44106() != c18271.f59611) {
            return;
        }
        int iM44108 = c19017.m44108();
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.remove(Integer.valueOf(iM44108 + i2));
        }
        int iM44103 = c19017.m44103();
        if (iM44108 - iM44103 == 0) {
            for (int i3 = 0; i3 < iM44103; i3++) {
                hashSet.remove(Integer.valueOf(i3));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C18271 m42424(C18271 c18271) {
        C18271 c18272 = new C18271(c18271.f59611);
        c18272.f59612.retainAll(c18271.f59612);
        return c18272;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m42423(C18271 c18271) {
        return c18271.f59612.isEmpty();
    }
}
