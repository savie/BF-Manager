.class public final Ll/ۚ᩵ܽ;
.super Ljava/lang/Object;
.source "W86M"


# instance fields
.field public final ۙ:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۚ᩵ܽ;->ۙ:Ljava/lang/reflect/Field;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/ۚ᩵ܽ;->ۙ:Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
