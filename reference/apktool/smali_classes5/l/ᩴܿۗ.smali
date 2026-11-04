.class public final Ll/ᩴܿۗ;
.super Ljava/lang/Object;
.source "B5SN"

# interfaces
.implements Ll/᩸ܿۗ;


# instance fields
.field public final ۙ:[I

.field public final ۤ:[I

.field public final ᩷:I


# direct methods
.method public constructor <init>(I[I[I)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p1, p0, Ll/ᩴܿۗ;->᩷:I

    .line 13
    iput-object p2, p0, Ll/ᩴܿۗ;->ۙ:[I

    .line 14
    iput-object p3, p0, Ll/ᩴܿۗ;->ۤ:[I

    return-void
.end method


# virtual methods
.method public final getSize()I
    .locals 1

    .line 19
    iget v0, p0, Ll/ᩴܿۗ;->᩷:I

    return v0
.end method

.method public final ֫()[I
    .locals 1

    .line 24
    iget-object v0, p0, Ll/ᩴܿۗ;->ۙ:[I

    return-object v0
.end method

.method public final ۚ()[I
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ᩴܿۗ;->ۤ:[I

    return-object v0
.end method
