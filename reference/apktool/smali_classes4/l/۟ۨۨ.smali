.class public final synthetic Ll/۟ۨۨ;
.super Ljava/lang/Object;
.source "X6CH"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ܰ:Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۨۨ;->ܰ:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 210
    new-instance v0, Ll/ۙ֫ۗ;

    iget-object v1, p0, Ll/۟ۨۨ;->ܰ:Ljava/lang/CharSequence;

    const-string v2, ""

    invoke-direct {v0, v1, v2, v2}, Ll/ۙ֫ۗ;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-object v0
.end method
