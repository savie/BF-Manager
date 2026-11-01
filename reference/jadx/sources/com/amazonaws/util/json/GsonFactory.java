package com.amazonaws.util.json;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import l.C5379;
import l.EnumC22313;

/* JADX INFO: loaded from: classes.dex */
public final class GsonFactory implements AwsJsonFactory {

    public final class GsonReader {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final C5379 f866;

        public GsonReader(StringReader stringReader) {
            this.f866 = new C5379(stringReader);
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m805() throws IOException {
            this.f866.m14917();
        }

        /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
        public final void m807() throws IOException {
            this.f866.m14910();
        }

        /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
        public final boolean m806() throws IOException {
            EnumC22313 enumC22313M14916 = this.f866.m14916();
            return EnumC22313.BEGIN_ARRAY.equals(enumC22313M14916) || EnumC22313.BEGIN_OBJECT.equals(enumC22313M14916);
        }

        /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
        public final boolean m803() {
            return this.f866.m14924();
        }

        /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
        public final String m810() {
            return this.f866.m14921();
        }

        /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
        public final String m802() throws IOException {
            C5379 c5379 = this.f866;
            EnumC22313 enumC22313M14916 = c5379.m14916();
            if (EnumC22313.NULL.equals(enumC22313M14916)) {
                c5379.m14918();
                return null;
            }
            if (EnumC22313.BOOLEAN.equals(enumC22313M14916)) {
                return c5379.m14927() ? "true" : "false";
            }
            return c5379.m14922();
        }

        /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
        public final void m804() throws IOException {
            this.f866.m14911();
        }

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public final AwsJsonToken m808() throws IOException {
            try {
                EnumC22313 enumC22313M14916 = this.f866.m14916();
                if (enumC22313M14916 == null) {
                    return null;
                }
                switch (AnonymousClass1.f865[enumC22313M14916.ordinal()]) {
                    case 1:
                        return AwsJsonToken.BEGIN_ARRAY;
                    case 2:
                        return AwsJsonToken.END_ARRAY;
                    case 3:
                        return AwsJsonToken.BEGIN_OBJECT;
                    case 4:
                        return AwsJsonToken.END_OBJECT;
                    case 5:
                        return AwsJsonToken.FIELD_NAME;
                    case 6:
                        return AwsJsonToken.VALUE_BOOLEAN;
                    case 7:
                        return AwsJsonToken.VALUE_NUMBER;
                    case 8:
                        return AwsJsonToken.VALUE_NULL;
                    case 9:
                        return AwsJsonToken.VALUE_STRING;
                    case 10:
                        return null;
                    default:
                        return AwsJsonToken.UNKNOWN;
                }
            } catch (EOFException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        public final void m809() throws IOException {
            this.f866.close();
        }
    }

    /* JADX INFO: renamed from: com.amazonaws.util.json.GsonFactory$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public static final /* synthetic */ int[] f865;

        static {
            int[] iArr = new int[EnumC22313.values().length];
            f865 = iArr;
            try {
                iArr[EnumC22313.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f865[EnumC22313.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f865[EnumC22313.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f865[EnumC22313.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f865[EnumC22313.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f865[EnumC22313.BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f865[EnumC22313.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f865[EnumC22313.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f865[EnumC22313.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f865[EnumC22313.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }
}
