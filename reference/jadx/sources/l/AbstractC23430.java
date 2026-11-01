package l;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6YQ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23430 implements InterfaceC2967 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final HashSet f75855 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f75856;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f75857;

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo1242();

    public AbstractC23430(String str, String str2) {
        this.f75857 = str;
        this.f75856 = str2;
        f75855.add(this);
    }

    @Override // l.InterfaceC2967
    /* JADX INFO: renamed from: ۙ */
    public final String mo8793() {
        return this.f75857;
    }

    @Override // l.InterfaceC2967
    public final boolean isSupported() {
        return mo1242() || mo3563();
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo3563() {
        HashSet hashSet = C20607.f67142;
        String str = this.f75856;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Set m51595() {
        return C0561.unmodifiableSet(f75855);
    }
}
