package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.᩹ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48R2 */
/* JADX INFO: loaded from: classes.dex */
public class C23263 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f75377;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f75378;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f75379;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f75380;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f75381;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f75382;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15803 f75383;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f75384;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f75385;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f75386;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f75387;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f75388;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f75389;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f75390;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f75391;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f75392;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f75393;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f75394;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f75395;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f75396;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f75397;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f75398;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f75399;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f75400;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f75401;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75402;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashSet f75403;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f75404;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f75405;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f75406;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f75407;

    /* JADX INFO: renamed from: ۙ */
    public C23263 mo12046(C17295 c17295) {
        C16549 c16549 = c17295.f56324;
        mo12043(c16549.f53565);
        this.f75391.put(c16549, c17295);
        return this;
    }

    public C23263() {
        this.f75397 = Integer.MAX_VALUE;
        this.f75396 = Integer.MAX_VALUE;
        this.f75407 = Integer.MAX_VALUE;
        this.f75390 = Integer.MAX_VALUE;
        this.f75380 = Integer.MAX_VALUE;
        this.f75378 = Integer.MAX_VALUE;
        this.f75392 = true;
        this.f75387 = true;
        this.f75377 = AbstractC1928.of();
        this.f75398 = AbstractC1928.of();
        this.f75386 = 0;
        this.f75385 = AbstractC1928.of();
        this.f75382 = 0;
        this.f75379 = Integer.MAX_VALUE;
        this.f75384 = Integer.MAX_VALUE;
        this.f75406 = AbstractC1928.of();
        this.f75383 = C15803.f51417;
        this.f75393 = AbstractC1928.of();
        this.f75402 = 0;
        this.f75388 = true;
        this.f75400 = 0;
        this.f75399 = false;
        this.f75394 = false;
        this.f75404 = false;
        this.f75389 = false;
        this.f75391 = new HashMap();
        this.f75403 = new HashSet();
    }

    public C23263(C3125 c3125) {
        m52374(c3125);
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52374(C3125 c3125) {
        this.f75397 = c3125.f10125;
        this.f75396 = c3125.f10124;
        this.f75407 = c3125.f10135;
        this.f75390 = c3125.f10118;
        this.f75401 = c3125.f10129;
        this.f75381 = c3125.f10109;
        this.f75405 = c3125.f10133;
        this.f75395 = c3125.f10123;
        this.f75380 = c3125.f10108;
        this.f75378 = c3125.f10106;
        this.f75392 = c3125.f10120;
        this.f75387 = c3125.f10115;
        this.f75377 = c3125.f10105;
        this.f75398 = c3125.f10126;
        this.f75386 = c3125.f10114;
        this.f75385 = c3125.f10113;
        this.f75382 = c3125.f10110;
        this.f75379 = c3125.f10107;
        this.f75384 = c3125.f10112;
        this.f75406 = c3125.f10134;
        this.f75383 = c3125.f10111;
        this.f75393 = c3125.f10121;
        this.f75402 = c3125.f10130;
        this.f75388 = c3125.f10116;
        this.f75400 = c3125.f10128;
        this.f75399 = c3125.f10127;
        this.f75394 = c3125.f10122;
        this.f75404 = c3125.f10132;
        this.f75389 = c3125.f10117;
        this.f75403 = new HashSet(c3125.f10131);
        this.f75391 = new HashMap(c3125.f10119);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52379(C3125 c3125) {
        m52374(c3125);
    }

    /* JADX INFO: renamed from: ۤ */
    public C23263 mo12048() {
        return mo12047(new String[0]);
    }

    /* JADX INFO: renamed from: ᩸ */
    public C23263 mo12051() {
        this.f75402 = 0;
        this.f75388 = false;
        return this;
    }

    /* JADX INFO: renamed from: ᩷ */
    public C23263 mo12049() {
        this.f75400 = -3;
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public C23263 mo12043(int i) {
        Iterator it = this.f75391.values().iterator();
        while (it.hasNext()) {
            if (((C17295) it.next()).f56324.f53565 == i) {
                it.remove();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public C23263 mo12045(Set set) {
        this.f75403.clear();
        this.f75403.addAll(set);
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public C23263 mo12044(int i, boolean z) {
        if (z) {
            this.f75403.add(Integer.valueOf(i));
            return this;
        }
        this.f75403.remove(Integer.valueOf(i));
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public C3125 mo12042() {
        return new C3125(this);
    }

    /* JADX INFO: renamed from: ۙ */
    public C23263 mo12047(String... strArr) {
        int i = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        for (String str : strArr) {
            str.getClass();
            c22811.m19807(C7116.m19496(str));
        }
        this.f75393 = c22811.m51441();
        this.f75388 = false;
        return this;
    }
}
