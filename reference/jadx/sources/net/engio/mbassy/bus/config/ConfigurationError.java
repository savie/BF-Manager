package net.engio.mbassy.bus.config;

import l.C20551;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigurationError extends RuntimeException {
    public String message;

    public ConfigurationError(String str) {
        this.message = str;
    }

    public static ConfigurationError MissingFeature(Class cls) {
        return new ConfigurationError(C20551.m47117(cls, "The expected feature ", " was missing. Use addFeature() in IBusConfiguration to add features."));
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.message;
    }
}
