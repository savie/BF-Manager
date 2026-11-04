package l;

import com.alipay.sdk.m.w.a;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: renamed from: l.ᩴۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DQ */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC19727 {
    ADD(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX),
    SUB("-"),
    MUL("*"),
    DIV("/"),
    REM("%"),
    AND(a.p),
    OR("|"),
    XOR("^"),
    SHL("<<"),
    SHR(">>"),
    USHR(">>>");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f63498;

    EnumC19727(String str) {
        this.f63498 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m45425() {
        return this.f63498;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m45426() {
        int iOrdinal = ordinal();
        return iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7;
    }
}
