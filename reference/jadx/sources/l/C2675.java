package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6BN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2675 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C2675 f8501 = m8836(new EnumC9386[0]);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C2675 f8502;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C2675 f8503;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C2675 f8504;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f8505;

    static {
        EnumC9386 enumC9386 = EnumC9386.ALLOW_WIDER;
        f8504 = m8836(enumC9386);
        f8502 = m8836(enumC9386, EnumC9386.IGNORE_SAME);
        f8503 = m8836(enumC9386, EnumC9386.KEEP_GENERICS, EnumC9386.IGNORE_UNKNOWN);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2675 m8836(EnumC9386... enumC9386Arr) {
        EnumSet enumSetCopyOf;
        if (enumC9386Arr.length == 0) {
            enumSetCopyOf = EnumSet.noneOf(EnumC9386.class);
        } else {
            ArrayList arrayList = new ArrayList(enumC9386Arr.length);
            for (EnumC9386 enumC9386 : enumC9386Arr) {
                C17359.requireNonNull(enumC9386);
                arrayList.add(enumC9386);
            }
            enumSetCopyOf = EnumSet.copyOf((Collection) C4681.unmodifiableList(arrayList));
        }
        return new C2675(enumSetCopyOf);
    }

    public C2675(EnumSet enumSet) {
        this.f8505 = enumSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8837() {
        return this.f8505.contains(EnumC9386.ALLOW_WIDER);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m8839() {
        return this.f8505.contains(EnumC9386.IGNORE_SAME);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m8838() {
        return this.f8505.contains(EnumC9386.IGNORE_UNKNOWN);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m8840() {
        return this.f8505.contains(EnumC9386.KEEP_GENERICS);
    }

    public final String toString() {
        return this.f8505.toString();
    }
}
