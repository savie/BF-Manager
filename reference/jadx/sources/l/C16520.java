package l;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8K0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16520 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f53067;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f53069;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f53081;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f53077 = "";

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f53078 = "";

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Set f53080 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f53072 = "";

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f53070 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f53068 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f53074 = false;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f53082 = -1;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f53079 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53075 = -1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f53071 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f53066 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f53076 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f53073 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38876(String str) {
        this.f53077 = str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38873(String str) {
        this.f53078 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38868(String[] strArr) {
        this.f53080 = new HashSet(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m38860(String str) {
        this.f53072 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38863(String str, String str2, Set set, String str3) {
        if (this.f53077.isEmpty() && this.f53078.isEmpty() && this.f53080.isEmpty() && this.f53072.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iM38856 = m38856(this.f53072, m38856(this.f53078, m38856(this.f53077, 0, 1073741824, str), 2, str2), 4, str3);
        if (iM38856 == -1 || !set.containsAll(this.f53080)) {
            return 0;
        }
        return (this.f53080.size() * 4) + iM38856;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m38874() {
        int i = this.f53075;
        if (i == -1 && this.f53071 == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f53071 == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m38883() {
        return this.f53082 == 1;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m38878() {
        return this.f53079 == 1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m38880() {
        this.f53079 = 1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m38881() {
        this.f53075 = 1;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m38879() {
        this.f53071 = 1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m38858() {
        return this.f53070;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38866(String str) {
        this.f53070 = C20733.m46672(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m38871() {
        if (!this.f53068) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.f53067;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38875(int i) {
        this.f53067 = i;
        this.f53068 = true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m38870() {
        return this.f53068;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38862() {
        if (!this.f53074) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.f53069;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38865(int i) {
        this.f53069 = i;
        this.f53074 = true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m38861() {
        return this.f53074;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38864(float f) {
        this.f53081 = f;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38872(int i) {
        this.f53066 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m38882() {
        return this.f53066;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m38869() {
        return this.f53081;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m38859(int i) {
        this.f53076 = i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m38857() {
        return this.f53076;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38867(boolean z) {
        this.f53073 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m38877() {
        return this.f53073;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38856(String str, int i, int i2, String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
