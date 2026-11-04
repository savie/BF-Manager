package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U19E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4849 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f16932;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f16933;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f16934;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f16935;

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public C4849(ArrayList arrayList, int i, int i2) {
        String strM34333;
        this.f16935 = i;
        this.f16933 = i2;
        if (arrayList.isEmpty()) {
            strM34333 = null;
        } else {
            C14126 c14126 = (C14126) arrayList.get(0);
            if ("Name".equalsIgnoreCase(c14126.m34332())) {
                strM34333 = c14126.m34333();
            } else {
                strM34333 = null;
            }
        }
        this.f16934 = strM34333;
        this.f16932 = C4681.unmodifiableList(new ArrayList(arrayList));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m14891() {
        return this.f16934;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m14892() {
        return this.f16935;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m14890() {
        return this.f16933;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m14889() {
        return this.f16932;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m14888(String str) {
        for (C14126 c14126 : this.f16932) {
            if (c14126.m34332().equalsIgnoreCase(str)) {
                return c14126.m34333();
            }
        }
        return null;
    }
}
