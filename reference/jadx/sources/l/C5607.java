package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4ZG */
/* JADX INFO: loaded from: classes2.dex */
public final class C5607 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f19434;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f19435;

    public C5607(C20348 c20348) {
        this.f19435 = c20348.m46756();
        int i = c20348.readInt();
        this.f19434 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            List list = this.f19434;
            C15301 c15301 = new C15301();
            c15301.f50017 = true;
            c15301.f50015 = c20348.readInt();
            c15301.f50016 = c20348.readInt();
            c15301.f50013 = c20348.readInt();
            c15301.f50019 = c20348.readInt();
            c15301.f50022 = c20348.readInt();
            c15301.f50021 = c20348.m46756();
            c15301.f50018 = c20348.m46756();
            c15301.f50014 = c20348.m46756();
            c15301.f50020 = c20348.m46756();
            list.add(c15301);
        }
    }

    public C5607(String str, List list) {
        this.f19435 = str;
        this.f19434 = list;
    }
}
