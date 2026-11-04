package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 75VW */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC25066 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f81067;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81068;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f81069;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f81070;

    public /* synthetic */ RunnableC25066(Object obj, Object obj2, Object obj3, int i) {
        this.f81068 = i;
        this.f81070 = obj;
        this.f81069 = obj2;
        this.f81067 = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3 A[Catch: all -> 0x0109, TryCatch #1 {all -> 0x0109, blocks: (B:8:0x002c, B:11:0x0036, B:12:0x0053, B:14:0x0059, B:15:0x0067, B:17:0x006d, B:18:0x007b, B:38:0x00b5, B:39:0x00bd, B:41:0x00c3, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00ed, B:50:0x00fb, B:20:0x007f, B:23:0x0088, B:26:0x0091, B:29:0x009a, B:32:0x00a3, B:35:0x00ac), top: B:63:0x002c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[Catch: all -> 0x0109, TryCatch #1 {all -> 0x0109, blocks: (B:8:0x002c, B:11:0x0036, B:12:0x0053, B:14:0x0059, B:15:0x0067, B:17:0x006d, B:18:0x007b, B:38:0x00b5, B:39:0x00bd, B:41:0x00c3, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00ed, B:50:0x00fb, B:20:0x007f, B:23:0x0088, B:26:0x0091, B:29:0x009a, B:32:0x00a3, B:35:0x00ac), top: B:63:0x002c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, l.ۚۡۙ] */
    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        InterfaceC5650 value;
        switch (this.f81068) {
            case 0:
                C15102 c15102 = (C15102) this.f81070;
                C2494 c2494 = (C2494) this.f81069;
                C21712 c21712 = (C21712) this.f81067;
                try {
                    C22941 c22941 = new C22941(c15102.m36371());
                    try {
                        C8002 entry = c22941.getEntry("resources.arsc");
                        if (entry != null) {
                            C24296 c24296 = new C24296(c22941.m51727(entry));
                            c24296.m54313();
                            String strSubstring = c2494.getPath().substring(1);
                            Iterator it2 = c24296.mo15672().iterator();
                            while (it2.hasNext()) {
                                for (InterfaceC15344 interfaceC15344 : ((InterfaceC10869) it2.next()).mo19822()) {
                                    String typeName = interfaceC15344.getTypeName();
                                    switch (typeName.hashCode()) {
                                        case -891985903:
                                            if (!typeName.equals("string")) {
                                                it = interfaceC15344.mo33925().iterator();
                                                while (it.hasNext()) {
                                                    for (InterfaceC8697 interfaceC8697 : ((InterfaceC2731) it.next()).mo9078()) {
                                                        if (!interfaceC8697.mo18155()) {
                                                            value = interfaceC8697.getValue();
                                                            if (!value.mo16636() && value.mo11710().getValue().equals(strSubstring)) {
                                                                C21576.m49068(new RunnableC16860(0, c21712, interfaceC8697));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case -475309713:
                                            if (!typeName.equals("plurals")) {
                                                it = interfaceC15344.mo33925().iterator();
                                                while (it.hasNext()) {
                                                    while (r6.hasNext()) {
                                                        if (!interfaceC8697.mo18155()) {
                                                            value = interfaceC8697.getValue();
                                                            if (!value.mo16636()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 3355:
                                            if (!typeName.equals("id")) {
                                                it = interfaceC15344.mo33925().iterator();
                                                while (it.hasNext()) {
                                                    while (r6.hasNext()) {
                                                        if (!interfaceC8697.mo18155()) {
                                                            value = interfaceC8697.getValue();
                                                            if (!value.mo16636()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 3004913:
                                            if (!typeName.equals("attr")) {
                                                it = interfaceC15344.mo33925().iterator();
                                                while (it.hasNext()) {
                                                    while (r6.hasNext()) {
                                                        if (!interfaceC8697.mo18155()) {
                                                            value = interfaceC8697.getValue();
                                                            if (!value.mo16636()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 93090393:
                                            if (!typeName.equals("array")) {
                                                it = interfaceC15344.mo33925().iterator();
                                                while (it.hasNext()) {
                                                    while (r6.hasNext()) {
                                                        if (!interfaceC8697.mo18155()) {
                                                            value = interfaceC8697.getValue();
                                                            if (!value.mo16636()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 109780401:
                                            if (!typeName.equals("style")) {
                                                it = interfaceC15344.mo33925().iterator();
                                                while (it.hasNext()) {
                                                    while (r6.hasNext()) {
                                                        if (!interfaceC8697.mo18155()) {
                                                            value = interfaceC8697.getValue();
                                                            if (!value.mo16636()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            it = interfaceC15344.mo33925().iterator();
                                            while (it.hasNext()) {
                                                while (r6.hasNext()) {
                                                    if (!interfaceC8697.mo18155()) {
                                                        value = interfaceC8697.getValue();
                                                        if (!value.mo16636()) {
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            }
                        }
                        c22941.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            c22941.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable unused) {
                    return;
                }
            default:
                C12994 c12994 = (C12994) this.f81070;
                Exception exc = (Exception) this.f81067;
                this.f81069.mo7206(c12994.f41644, c12994.f41645, exc);
                return;
        }
    }
}
