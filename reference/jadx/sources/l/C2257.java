package l;

/* JADX INFO: renamed from: l.֫᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R85J */
/* JADX INFO: loaded from: classes3.dex */
public final class C2257 implements InterfaceC16075 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C5986 f7384;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C5986 f7385;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f7386 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C24281 f7387;

    static {
        int i = 0;
        f7385 = new C5986(i);
        f7384 = new C5986(i);
    }

    public C2257(C24281 c24281) {
        this.f7387 = c24281;
    }

    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        InterfaceC23535 interfaceC23535 = (InterfaceC23535) c6446.m18232().getAnnotation(InterfaceC23535.class);
        if (interfaceC23535 == null) {
            return null;
        }
        return m7685(this.f7387, c24522, c6446, interfaceC23535, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17567 m7685(C24281 c24281, C24522 c24522, C6446 c6446, InterfaceC23535 interfaceC23535, boolean z) {
        C5986 c5986;
        AbstractC17567 c8968;
        Object objConstruct = c24281.m54297(C6446.m18229(interfaceC23535.value()), true).construct();
        boolean zNullSafe = interfaceC23535.nullSafe();
        if (objConstruct instanceof AbstractC17567) {
            c8968 = (AbstractC17567) objConstruct;
        } else if (objConstruct instanceof InterfaceC16075) {
            InterfaceC16075 interfaceC16075 = (InterfaceC16075) objConstruct;
            if (z) {
                InterfaceC16075 interfaceC16076 = (InterfaceC16075) this.f7386.putIfAbsent(c6446.m18232(), interfaceC16075);
                if (interfaceC16076 != null) {
                    interfaceC16075 = interfaceC16076;
                }
            }
            c8968 = interfaceC16075.mo1459(c24522, c6446);
        } else {
            boolean z2 = objConstruct instanceof InterfaceC8858;
            if (z2 || (objConstruct instanceof InterfaceC18554)) {
                InterfaceC8858 interfaceC8858 = z2 ? (InterfaceC8858) objConstruct : null;
                InterfaceC18554 interfaceC18554 = objConstruct instanceof InterfaceC18554 ? (InterfaceC18554) objConstruct : null;
                if (z) {
                    c5986 = f7385;
                } else {
                    c5986 = f7384;
                }
                c8968 = new C8968(interfaceC8858, interfaceC18554, c24522, c6446, c5986, zNullSafe);
                zNullSafe = false;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objConstruct.getClass().getName() + " as a @JsonAdapter for " + c6446.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (c8968 == null || !zNullSafe) ? c8968 : c8968.m41229();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7686(InterfaceC16075 interfaceC16075, C6446 c6446) {
        C17359.requireNonNull(c6446);
        C17359.requireNonNull(interfaceC16075);
        if (interfaceC16075 != f7385) {
            Class clsM18232 = c6446.m18232();
            ConcurrentMapC17249 concurrentMapC17249 = this.f7386;
            InterfaceC16075 interfaceC16076 = (InterfaceC16075) concurrentMapC17249.get(clsM18232);
            if (interfaceC16076 == null) {
                InterfaceC23535 interfaceC23535 = (InterfaceC23535) clsM18232.getAnnotation(InterfaceC23535.class);
                if (interfaceC23535 == null) {
                    return false;
                }
                Class clsValue = interfaceC23535.value();
                if (!InterfaceC16075.class.isAssignableFrom(clsValue)) {
                    return false;
                }
                InterfaceC16075 interfaceC16077 = (InterfaceC16075) this.f7387.m54297(C6446.m18229(clsValue), true).construct();
                InterfaceC16075 interfaceC16078 = (InterfaceC16075) concurrentMapC17249.putIfAbsent(clsM18232, interfaceC16077);
                if (interfaceC16078 != null) {
                    interfaceC16077 = interfaceC16078;
                }
                if (interfaceC16077 != interfaceC16075) {
                    return false;
                }
            } else if (interfaceC16076 != interfaceC16075) {
                return false;
            }
        }
        return true;
    }
}
