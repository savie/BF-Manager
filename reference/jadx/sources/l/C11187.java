package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۤ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 16RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11187 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle f35284;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11121 f35285;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20508 f35286;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16122 f35287;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f35288;

    public C11187(C7941 c7941, C16320 c16320, C24132 c24132) {
        this.f35288 = c16320.f52980.mo11043().m41105();
        this.f35284 = new Bundle(c7941.f23990);
        C23056 c23056M21635 = c7941.m21635();
        C11121 c11121 = null;
        if (c23056M21635 != null) {
            int i = c23056M21635.f74804;
            int i2 = c23056M21635.f74803;
            boolean z = c23056M21635.f74806;
            int i3 = c23056M21635.f74805;
            AbstractC22044 abstractC22044 = c23056M21635.f74802;
            c11121 = new C11121(i, i2, z, i3, abstractC22044 != null ? abstractC22044.mo4294() : null, c23056M21635.f74807 != null, c23056M21635.f74808);
        }
        this.f35285 = c11121;
        this.f35286 = c24132.m53867();
        this.f35287 = c7941.f26385.m52815();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28188(C11187 c11187) {
        if (c11187 == null) {
            return false;
        }
        C11121 c11121 = c11187.f35285;
        Bundle bundle = c11187.f35284;
        if (this.f35288 != c11187.f35288 || !this.f35286.m47029(c11187.f35286) || !this.f35287.m38283(c11187.f35287)) {
            return false;
        }
        C11121 c11122 = this.f35285;
        if (c11122 == null) {
            if (c11121 != null) {
                return false;
            }
        } else if (!c11122.m28071(c11121)) {
            return false;
        }
        Bundle bundle2 = this.f35284;
        if (bundle2.size() != bundle.size()) {
            return false;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str) || !C17359.equals(bundle2.get(str), bundle.get(str))) {
                return false;
            }
        }
        return true;
    }
}
