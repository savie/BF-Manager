package com.amazonaws.util.json;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import l.C4208;
import l.EnumC14648;

/* JADX INFO: loaded from: classes.dex */
public final class GsonFactory implements AwsJsonFactory {

    public final class GsonReader {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final C4208 f856;

        public GsonReader(StringReader stringReader) {
            this.f856 = new C4208(stringReader);
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final void m797() throws IOException {
            this.f856.m13456();
        }

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public final void m799() throws IOException {
            this.f856.m13447();
        }

        /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
        public final boolean m802() throws IOException {
            EnumC14648 enumC14648M13438 = this.f856.m13438();
            return EnumC14648.BEGIN_ARRAY.equals(enumC14648M13438) || EnumC14648.BEGIN_OBJECT.equals(enumC14648M13438);
        }

        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
        public final boolean m804() {
            return this.f856.m13457();
        }

        /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
        public final String m801() {
            return this.f856.m13437();
        }

        /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
        public final String m800() throws IOException {
            C4208 c4208 = this.f856;
            EnumC14648 enumC14648M13438 = c4208.m13438();
            if (EnumC14648.NULL.equals(enumC14648M13438)) {
                c4208.m13444();
                return null;
            }
            if (EnumC14648.BOOLEAN.equals(enumC14648M13438)) {
                return c4208.m13440() ? "true" : "false";
            }
            return c4208.m13453();
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m796() throws IOException {
            this.f856.m13445();
        }

        /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
        public final AwsJsonToken m798() throws IOException {
            try {
                EnumC14648 enumC14648M13438 = this.f856.m13438();
                if (enumC14648M13438 == null) {
                    return null;
                }
                switch (AnonymousClass1.f855[enumC14648M13438.ordinal()]) {
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

        /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
        public final void m803() throws IOException {
            this.f856.close();
        }
    }

    /* JADX INFO: renamed from: com.amazonaws.util.json.GsonFactory$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public static final /* synthetic */ int[] f855;

        static {
            int[] iArr = new int[EnumC14648.values().length];
            f855 = iArr;
            try {
                iArr[EnumC14648.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f855[EnumC14648.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f855[EnumC14648.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f855[EnumC14648.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f855[EnumC14648.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f855[EnumC14648.BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f855[EnumC14648.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f855[EnumC14648.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f855[EnumC14648.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f855[EnumC14648.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }
}
