package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.᩻۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48R2 */
/* JADX INFO: loaded from: classes.dex */
public class C23567 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f76322;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f76323;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f76324;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f76325;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10867 f76326;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f76327;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f76328;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f76329;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f76330;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f76331;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public HashMap f76332;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f76333;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f76334;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f76335;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f76336;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f76337;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashSet f76338;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f76339;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f76340;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f76341;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f76342;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f76343;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f76344;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f76345;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f76346;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f76347;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f76348;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f76349;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f76350;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f76351;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f76352;

    /* JADX INFO: renamed from: ۙ */
    public C23567 mo34365(C5927 c5927) {
        C17216 c17216 = c5927.f20187;
        mo34362(c17216.f54866);
        this.f76332.put(c17216, c5927);
        return this;
    }

    public C23567() {
        this.f76349 = Integer.MAX_VALUE;
        this.f76340 = Integer.MAX_VALUE;
        this.f76351 = Integer.MAX_VALUE;
        this.f76329 = Integer.MAX_VALUE;
        this.f76339 = Integer.MAX_VALUE;
        this.f76334 = Integer.MAX_VALUE;
        this.f76323 = true;
        this.f76352 = true;
        this.f76342 = AbstractC22433.of();
        this.f76322 = AbstractC22433.of();
        this.f76336 = 0;
        this.f76333 = AbstractC22433.of();
        this.f76348 = 0;
        this.f76325 = Integer.MAX_VALUE;
        this.f76337 = Integer.MAX_VALUE;
        this.f76330 = AbstractC22433.of();
        this.f76326 = C10867.f36953;
        this.f76341 = AbstractC22433.of();
        this.f76347 = 0;
        this.f76328 = true;
        this.f76327 = 0;
        this.f76343 = false;
        this.f76350 = false;
        this.f76324 = false;
        this.f76335 = false;
        this.f76332 = new HashMap();
        this.f76338 = new HashSet();
    }

    public C23567(C14395 c14395) {
        m51984(c14395);
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m51984(C14395 c14395) {
        this.f76349 = c14395.f47193;
        this.f76340 = c14395.f47184;
        this.f76351 = c14395.f47195;
        this.f76329 = c14395.f47173;
        this.f76346 = c14395.f47190;
        this.f76331 = c14395.f47175;
        this.f76345 = c14395.f47189;
        this.f76344 = c14395.f47188;
        this.f76339 = c14395.f47183;
        this.f76334 = c14395.f47178;
        this.f76323 = c14395.f47167;
        this.f76352 = c14395.f47196;
        this.f76342 = c14395.f47186;
        this.f76322 = c14395.f47166;
        this.f76336 = c14395.f47180;
        this.f76333 = c14395.f47177;
        this.f76348 = c14395.f47192;
        this.f76325 = c14395.f47169;
        this.f76337 = c14395.f47181;
        this.f76330 = c14395.f47174;
        this.f76326 = c14395.f47170;
        this.f76341 = c14395.f47185;
        this.f76347 = c14395.f47191;
        this.f76328 = c14395.f47172;
        this.f76327 = c14395.f47171;
        this.f76343 = c14395.f47187;
        this.f76350 = c14395.f47194;
        this.f76324 = c14395.f47168;
        this.f76335 = c14395.f47179;
        this.f76338 = new HashSet(c14395.f47182);
        this.f76332 = new HashMap(c14395.f47176);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51999(C14395 c14395) {
        m51984(c14395);
    }

    /* JADX INFO: renamed from: ۨ */
    public C23567 mo34367() {
        return mo34366(new String[0]);
    }

    /* JADX INFO: renamed from: ۖ */
    public C23567 mo34360() {
        this.f76347 = 0;
        this.f76328 = false;
        return this;
    }

    /* JADX INFO: renamed from: ܰ */
    public C23567 mo34368() {
        this.f76327 = -3;
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public C23567 mo34362(int i) {
        Iterator it = this.f76332.values().iterator();
        while (it.hasNext()) {
            if (((C5927) it.next()).f20187.f54866 == i) {
                it.remove();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public C23567 mo34364(Set set) {
        this.f76338.clear();
        this.f76338.addAll(set);
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public C23567 mo34363(int i, boolean z) {
        if (z) {
            this.f76338.add(Integer.valueOf(i));
            return this;
        }
        this.f76338.remove(Integer.valueOf(i));
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public C14395 mo34361() {
        return new C14395(this);
    }

    /* JADX INFO: renamed from: ۙ */
    public C23567 mo34366(String... strArr) {
        int i = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        for (String str : strArr) {
            str.getClass();
            c4793.m52163(C17983.m41850(str));
        }
        this.f76341 = c4793.m13309();
        this.f76328 = false;
        return this;
    }
}
