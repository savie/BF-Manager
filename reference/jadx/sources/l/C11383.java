package l;

/* JADX INFO: renamed from: l.ۨ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R78M */
/* JADX INFO: loaded from: classes3.dex */
public final class C11383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18134 f38375 = new C18134();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28494(String str) {
        C18134 c18134 = this.f38375;
        if (str != null) {
            c18134.getClass();
            if (str.length() >= 2 && str.charAt(0) == 'L' && C3184.m9601(1, str) == ';') {
                c18134.m42214(str);
                return;
            }
        }
        c18134.m42209(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13500 m28493(C1139 c1139, C13614 c13614) throws C12731 {
        C11497 c11497 = c1139.f5119;
        boolean zEquals = "exact".equals(c11497.f38671);
        C18134 c18134 = this.f38375;
        if (zEquals) {
            C4440 c4440M33293 = c13614.m33293(c18134.m42215(), "dexClassSimpleName");
            if (c4440M33293 != null) {
                return m28491(c1139, c4440M33293);
            }
            C4440 c4440M33294 = c13614.m33293(c18134.m42210(), "dexClassSimpleName");
            if (c4440M33294 != null) {
                return m28491(c1139, c4440M33294);
            }
            C4440 c4440M33295 = c13614.m33293(c18134.m42211(), "dexClassName");
            if (c4440M33295 != null) {
                return m28491(c1139, c4440M33295);
            }
            C4440 c4440M33296 = c13614.m33293(c18134.m42218(), "dexClassName");
            if (c4440M33296 != null) {
                return m28491(c1139, c4440M33296);
            }
            C4440 c4440M33297 = c13614.m33293(c18134.m42207(), "dexClassName");
            if (c4440M33297 != null) {
                return m28491(c1139, c4440M33297);
            }
            C4440 c4440M33298 = c13614.m33293(c18134.m42223(), "dexClassName");
            if (c4440M33298 == null) {
                return null;
            }
            return m28491(c1139, c4440M33298);
        }
        if (c11497.f38672) {
            C4440 c4440M33299 = c13614.m33293(c18134.m42211(), "dexClassName");
            if (c4440M33299 != null) {
                return m28491(c1139, c4440M33299);
            }
            C4440 c4440M332910 = c13614.m33293(c18134.m42218(), "dexClassName");
            if (c4440M332910 != null) {
                return m28491(c1139, c4440M332910);
            }
            C4440 c4440M332911 = c13614.m33293(c18134.m42223(), "dexClassName");
            if (c4440M332911 != null) {
                return m28491(c1139, c4440M332911);
            }
            C4440 c4440M332912 = c13614.m33293(c18134.m42207(), "dexClassName");
            if (c4440M332912 == null) {
                return null;
            }
            return m28491(c1139, c4440M332912);
        }
        C4440 c4440M33292 = c13614.m33292(c18134.m42221(), c18134.m42213(), c18134.m42211());
        if (c4440M33292 != null) {
            return m28491(c1139, c4440M33292);
        }
        C4440 c4440M332913 = c13614.m33292(c18134.m42208(), c18134.m42216(), c18134.m42218());
        if (c4440M332913 != null) {
            return m28491(c1139, c4440M332913);
        }
        C4440 c4440M332914 = c13614.m33292(c18134.m42208(), c18134.m42216(), c18134.m42223());
        if (c4440M332914 != null) {
            return m28491(c1139, c4440M332914);
        }
        C4440 c4440M332915 = c13614.m33292(c18134.m42208(), c18134.m42216(), c18134.m42207());
        if (c4440M332915 == null) {
            return null;
        }
        return m28491(c1139, c4440M332915);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C13500 m28491(C1139 c1139, C4440 c4440) {
        if (c1139.f5131) {
            c4440.m12388();
        } else {
            c4440 = null;
        }
        return new C13500(this.f38375.m42219(), c4440);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m28492() {
        return this.f38375.m42219();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28495(C22307 c22307) {
        String str = c22307.f72848;
        if ("none".equals(str)) {
            return true;
        }
        String str2 = c22307.f72849;
        boolean zEquals = "descriptorExact".equals(str);
        C18134 c18134 = this.f38375;
        if (zEquals) {
            return str2 != null && c18134.m42212(str2);
        }
        return str2 == null || str2.isEmpty() || c18134.m42220(str2) || c18134.m42222(str2) || c18134.m42217(str2);
    }
}
