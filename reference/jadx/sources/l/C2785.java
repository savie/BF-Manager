package l;

/* JADX INFO: renamed from: l.ۖ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 55UE */
/* JADX INFO: loaded from: classes2.dex */
public final class C2785 extends AbstractC20521 {
    public C2785(AbstractC20521 abstractC20521) {
        super(589824, abstractC20521);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8457(Object obj) {
        if (obj == null) {
            mo35159(1);
            return;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue >= -1 && iIntValue <= 5) {
                mo35159(iIntValue + 3);
                return;
            }
            if (iIntValue <= 127 && iIntValue >= -128) {
                mo35172(16, iIntValue);
                return;
            } else if (iIntValue <= 32767 && iIntValue >= -32768) {
                mo35172(17, iIntValue);
                return;
            } else {
                super.mo8457(obj);
                return;
            }
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            if (jLongValue == 0 || jLongValue == 1) {
                mo35159(((int) jLongValue) + 9);
                return;
            } else {
                super.mo8457(obj);
                return;
            }
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (fFloatValue == 0.0f) {
                mo35159(11);
                return;
            }
            if (fFloatValue == 1.0f) {
                mo35159(12);
                return;
            } else if (fFloatValue == 2.0f) {
                mo35159(13);
                return;
            } else {
                super.mo8457(obj);
                return;
            }
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue == 0.0d) {
                mo35159(14);
                return;
            } else if (dDoubleValue == 1.0d) {
                mo35159(15);
                return;
            } else {
                super.mo8457(obj);
                return;
            }
        }
        if (obj instanceof C14172) {
            switch (((C14172) obj).m34269()) {
                case 1:
                    mo33785("java/lang/Boolean", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 2:
                    mo33785("java/lang/Character", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 3:
                    mo33785("java/lang/Byte", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 4:
                    mo33785("java/lang/Short", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 5:
                    mo33785("java/lang/Integer", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 6:
                    mo33785("java/lang/Float", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 7:
                    mo33785("java/lang/Long", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                case 8:
                    mo33785("java/lang/Double", 178, "TYPE", "Ljava/lang/Class;");
                    break;
                default:
                    super.mo8457(obj);
                    break;
            }
            return;
        }
        super.mo8457(obj);
    }
}
