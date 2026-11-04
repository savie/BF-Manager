package l;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C6YQ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24327 implements InterfaceC18359 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final HashSet f78902 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f78903;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f78904;

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo11211();

    public AbstractC24327(String str, String str2) {
        this.f78904 = str;
        this.f78903 = str2;
        f78902.add(this);
    }

    @Override // l.InterfaceC18359
    /* JADX INFO: renamed from: ۙ */
    public final String mo42814() {
        return this.f78904;
    }

    @Override // l.InterfaceC18359
    public final boolean isSupported() {
        return mo11211() || mo27117();
    }

    /* JADX INFO: renamed from: ۤ */
    public boolean mo27117() {
        HashSet hashSet = C25073.f81092;
        String str = this.f78903;
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Set m54376() {
        return C4681.unmodifiableSet(f78902);
    }
}
