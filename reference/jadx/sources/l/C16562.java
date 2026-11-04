package l;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K8K0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16562 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f53605;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f53610;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53617;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f53611 = "";

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f53618 = "";

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Set f53613 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f53604 = "";

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f53614 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53603 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f53606 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f53619 = -1;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f53615 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f53616 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53608 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f53609 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53612 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f53607 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39230(String str) {
        this.f53611 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39221(String str) {
        this.f53618 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39217(String[] strArr) {
        this.f53613 = new HashSet(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m39234(String str) {
        this.f53604 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39212(String str, String str2, Set set, String str3) {
        if (this.f53611.isEmpty() && this.f53618.isEmpty() && this.f53613.isEmpty() && this.f53604.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iM39209 = m39209(this.f53604, m39209(this.f53618, m39209(this.f53611, 0, 1073741824, str), 2, str2), 4, str3);
        if (iM39209 == -1 || !set.containsAll(this.f53613)) {
            return 0;
        }
        return (this.f53613.size() * 4) + iM39209;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m39218() {
        int i = this.f53616;
        if (i == -1 && this.f53608 == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f53608 == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m39236() {
        return this.f53619 == 1;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m39226() {
        return this.f53615 == 1;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m39235() {
        this.f53615 = 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39227() {
        this.f53616 = 1;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m39225() {
        this.f53608 = 1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m39232() {
        return this.f53614;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39215(String str) {
        this.f53614 = C7914.m21453(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m39219() {
        if (!this.f53603) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.f53617;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39229(int i) {
        this.f53617 = i;
        this.f53603 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m39222() {
        return this.f53603;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39211() {
        if (!this.f53606) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.f53605;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39214(int i) {
        this.f53605 = i;
        this.f53606 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39210() {
        return this.f53606;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39213(float f) {
        this.f53610 = f;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39220(int i) {
        this.f53609 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m39224() {
        return this.f53609;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m39228() {
        return this.f53610;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m39233(int i) {
        this.f53612 = i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m39223() {
        return this.f53612;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39216(boolean z) {
        this.f53607 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m39231() {
        return this.f53607;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39209(String str, int i, int i2, String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
