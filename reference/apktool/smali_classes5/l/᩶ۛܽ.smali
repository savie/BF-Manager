.class public abstract Ll/᩶ۛܽ;
.super Ljava/lang/Object;
.source "G851"


# static fields
.field public static final ᩷:Ll/᩶ۛܽ;


# instance fields
.field public final ۙ:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 83
    new-instance v0, Ll/ܰۛܽ;

    const-class v1, Ljava/util/Date;

    .line 84
    invoke-direct {v0, v1}, Ll/᩶ۛܽ;-><init>(Ljava/lang/Class;)V

    .line 83
    sput-object v0, Ll/᩶ۛܽ;->᩷:Ll/᩶ۛܽ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    iput-object p1, p0, Ll/᩶ۛܽ;->ۙ:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public abstract ۙ(Ljava/util/Date;)Ljava/util/Date;
.end method

.method public final ۙ(II)Ll/ܶۨܽ;
    .locals 1

    .line 108
    new-instance v0, Ll/ܿۛܽ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܿۛܽ;-><init>(Ll/᩶ۛܽ;II)V

    .line 100
    sget-object p1, Ll/᩸ܰܽ;->ܺ:Ll/ܶۨܽ;

    .line 1006
    new-instance p1, Ll/ۘۘܽ;

    iget-object p2, p0, Ll/᩶ۛܽ;->ۙ:Ljava/lang/Class;

    invoke-direct {p1, p2, v0}, Ll/ۘۘܽ;-><init>(Ljava/lang/Class;Ll/ܽۨܽ;)V

    return-object p1
.end method
