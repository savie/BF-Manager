package l;

/* JADX INFO: renamed from: l.᩺ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55UE */
/* JADX INFO: loaded from: classes.dex */
public final class C24061 extends AbstractC15037 {
    public C24061(AbstractC15037 abstractC15037) {
        super(589824, abstractC15037);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10795(Object obj) {
        if (obj == null) {
            mo10787(1);
            return;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue >= -1 && iIntValue <= 5) {
                mo10787(iIntValue + 3);
                return;
            }
            if (iIntValue <= 127 && iIntValue >= -128) {
                mo10811(16, iIntValue);
                return;
            } else if (iIntValue <= 32767 && iIntValue >= -32768) {
                mo10811(17, iIntValue);
                return;
            } else {
                super.mo10795(obj);
                return;
            }
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            if (jLongValue == 0 || jLongValue == 1) {
                mo10787(((int) jLongValue) + 9);
                return;
            } else {
                super.mo10795(obj);
                return;
            }
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (fFloatValue == 0.0f) {
                mo10787(11);
                return;
            }
            if (fFloatValue == 1.0f) {
                mo10787(12);
                return;
            } else if (fFloatValue == 2.0f) {
                mo10787(13);
                return;
            } else {
                super.mo10795(obj);
                return;
            }
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue == 0.0d) {
                mo10787(14);
                return;
            } else if (dDoubleValue == 1.0d) {
                mo10787(15);
                return;
            } else {
                super.mo10795(obj);
                return;
            }
        }
        if (obj instanceof C3105) {
            switch (((C3105) obj).m10140()) {
                case 1:
                    mo10796("java/lang/Boolean", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 2:
                    mo10796("java/lang/Character", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 3:
                    mo10796("java/lang/Byte", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 4:
                    mo10796("java/lang/Short", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 5:
                    mo10796("java/lang/Integer", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 6:
                    mo10796("java/lang/Float", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 7:
                    mo10796("java/lang/Long", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 8:
                    mo10796("java/lang/Double", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                default:
                    super.mo10795(obj);
                    break;
            }
            return;
        }
        super.mo10795(obj);
    }
}
